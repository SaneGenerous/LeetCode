public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : charArray){
            if( (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
        System.out.println(sb.length());
        if(sb.isEmpty()) return true;
        return sb.toString().toLowerCase().contentEquals(sb.reverse().toString().toLowerCase());
    }
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("0P"));
    }
}
