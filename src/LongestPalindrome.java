import java.util.Arrays;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        int even = 0, count = 0;
        boolean uneven = false;
        char[] chars = s.toCharArray();
        for(char c : chars){
            if( c > 96) arr[c - 71]++;
            else arr[c - 65]++;
        }
        for(int i = 0; i < 52; i++){
            count += arr[i];
            if(arr[i]%2 == 0) even += arr[i];
            else {
                even += arr[i] - 1;
                uneven = true;
                }
        }
        System.out.println("even = " + even + ", uneven = " + uneven);
        System.out.println("count = " + count);
        System.out.println("chars length() = " + chars.length);
        System.out.println(Arrays.toString(arr));
        if(uneven) return even + 1;
        else return even;
    }
    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        String s = "abccccdd";
        System.out.println("Longest palindrome =  " + lp.longestPalindrome(s));
        System.out.println("string length() = " + s.length());
    }
}

