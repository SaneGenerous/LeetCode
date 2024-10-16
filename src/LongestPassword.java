public class LongestPassword {
    public int solution(String S){
        if(S == null || S.isEmpty()) return -1;
        String[] words = S.split(" ");
        // ascii table [A - Z] [65 - 90]
        //ascii table [a - z] [97 - 122]
        //ascii table [0 - 9] [48 - 57]
        int letterCount = 0;
        int digitCount = 0;
        int maxLength = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if ((int) word.charAt(i) >= 65 || (int) word.charAt(i) <= 90 ) {
                    letterCount++;
                }
                if ((int) word.charAt(i) >= 97 || (int) word.charAt(i) <= 122 ) {
                    letterCount++;
                }
                if ((int) word.charAt(i) >= 48 || (int) word.charAt(i) <= 57 ) {
                    digitCount++;
                }
            }
            if((letterCount % 2) == 0 && (digitCount % 2) == 1 && maxLength < word.length()) {
                maxLength = word.length();
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LongestPassword lp = new LongestPassword();
        System.out.println(lp.solution("test 5 a0A pass007 ?xy1"));
    }
}
