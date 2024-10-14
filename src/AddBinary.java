public class AddBinary {
    public String addBinary(String a, String b) {
//        char[] charArrayA = a.toCharArray();
//        char[] charArrayB = b.toCharArray();
//        String sb = "";
//        boolean carry = false;
//        int shortestCharArray = Math.min(charArrayA.length, charArrayB.length);
//
//        char[] longest = charArrayA.length > charArrayB.length ? charArrayA : charArrayB;
//        char[] shortest = charArrayA.length < charArrayB.length ? charArrayA : charArrayB;
//        if(charArrayA.length == charArrayB.length){
//            longest = charArrayA;
//            shortest = charArrayB;
//        }
//
//        int diff = Math.abs(longest.length - shortest.length);
//        for (int i = shortestCharArray -1; i >= 0 ; i--) {
//                if ((int) shortest[i] + (int) longest[i + diff] == 98) {
//                    if (carry == false) {
//                        sb = "0" + sb;
//                        carry = true;
//                    } else {
//                        sb = "1" + sb;
//                    }
//                }
//                if ((int) shortest[i] + (int) longest[i + diff] == 97) {
//                    if (carry == false) {
//                        sb = "1" + sb;
//                    } else {
//                        sb = "0" + sb;
//                    }
//                }
//                if ((int) shortest[i] + (int) longest[i + diff] == 96) {
//                    if (carry == false) {
//                        sb = "0" + sb;
//                    } else {
//                        sb = "1" + sb;
//                        carry = false;
//                    }
//                }
//
//        }
//        if(charArrayA.length != charArrayB.length){
//        for (int i = diff - 1; i >= 0; i--) {
//            if((int)longest[i] == 49){
//                if(carry == true) {
//                    sb = "0" + sb;
//                } else {
//                    sb = "1" + sb;
//                }
//            }
//            if((int)longest[i] == 48){
//                if(carry == true) {
//                    sb = "1" + sb;
//                    carry = false;
//                } else {
//                    sb = "0" + sb;
//                }
//            }
//        }
//        }
//        if(carry == true) {
//            sb = "1" + sb;
//        }
//
//        return sb;

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        AddBinary addBinary = new AddBinary();
       /// System.out.println(addBinary.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
        //System.out.println(addBinary.addBinary("1010", "1011"));
        System.out.println(Math.pow(2, 12));
    }
}
