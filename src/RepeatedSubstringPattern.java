public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder(s);
        String temp = "";
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(0) == s.charAt(i)){
                int m = s.length()/i;
                while(m > 0){
                    temp += sb.substring(0, i);
                    m--;
                }
                if(temp.equals(s)) return true;
                temp = "";
            }
        }
        return false;
    }
    public static void main(String[] args) {
        RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();
        System.out.println(repeatedSubstringPattern.repeatedSubstringPattern("abaababaab"));
    }
}
