package Medium;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s ;
        String p = "", l = "";
        int j = 0;
        if(s.length() == 2 && s.charAt(0) == s.charAt(1)) l =  s; else l = "" + s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(i < s.length()-1 && s.charAt(i-1) == s.charAt(i+1)) {
                p = "" + s.charAt(i);
                while(i-1 - j >= 0 && i+1 + j < s.length()){
                    if(s.charAt(i-1-j) == s.charAt(i+1+j)){
                        p = s.charAt(i-1-j) + p + s.charAt(i+1+j);
                        j++;
                    } else break;
                }
                j = 0;
            }
            l = (l.length() < p.length()) ? p : l;
            p = "";
            if(s.charAt(i-1) == s.charAt(i)) {
                while(i-1 - j >= 0 && i + j < s.length()){
                    if(s.charAt(i-1-j) == s.charAt(i+j)) {
                        p = s.charAt(i-1-j) + p + s.charAt(i+j);
                        j++;
                    } else break;
                    //System.out.println("p = " + p + " l = " + l);
                }
                j = 0;
            }
            l = (l.length() < p.length()) ? p : l;
        }
        return (l.length() > 1) ? l : ""+s.charAt(0);
    }
    public static void main(String[] args) {
        LongestPalindrome l = new LongestPalindrome();
        System.out.println(l.longestPalindrome("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
    }
}
