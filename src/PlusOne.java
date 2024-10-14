import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public int[] solution(int[] digits){
        int[] array = {1};
        if(digits.length == 0) return array;
        if(digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
        } else {
            for(int i = digits.length - 1; i >= 0 ; i--) {
                 if (i > 0 && digits[i] == 9) {
                     digits[i] = 0;
                     if (digits[i - 1] < 9) {
                         digits[i - 1] += 1;
                         break;
                     }
                 } else if (digits[0] == 9) {
                      int[] arrayF = new int[digits.length + 1];
                      arrayF[0] = 1;
                     return arrayF;
                    }
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {9};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne.solution(digits)));
    }
}
