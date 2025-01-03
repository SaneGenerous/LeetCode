package Medium;

public class IntToRoman {
    public String intToRoman(int num) {
        int a = 0;
        String s = "";
        if(num >= 1000) a = num / 1000;
        if(num == 1000) {
            s = s + "M";
            a = 0;
            num = 0;
        } else num = num - (a*1000);
        for (int i = 0; i < a; i++) s = s + "M";
        if( num >= 100) a = num / 100;
        if(num == 100) {
            s = s + "C";
            a = 0;
            num = 0;
        } else num = num - (a*100);
        if(a == 9) {
            s = s + "CM";
            a = 0;
        }
        if(a >= 5) {
            s = s + "D";
            a -= 5;
        }
        if(a == 4) {
            s = s + "CD";
            a = 0;
        }
        if(a > 0) {
            for (int i = 0; i < a; i++) {
                s = s + "C";
            }
        }
        if(num >= 10) a = num / 10;
        if(num == 10) {
            s = s + "X";
            a = 0;
            num = 0;
        } else num = num - (a*10);
        if(a == 9) {
            s = s + "XC";
            a = 0;
        }
        if(a >= 5) {
            s = s + "L";
            a -= 5;
        }
        if(a == 4) {
            s = s + "XL";
            a = 0;
        }
        if(a > 0) {
            for (int i = 0; i < a; i++) {
                s = s + "X";
            }
        }

        if(num > 0) a = num;
        if(a == 9) {
            s = s + "IX";
            a = 0;
        }
        if(a >= 5) {
            s = s + "V";
            a -= 5;
        }
        if(a == 4) {
            s = s + "IV";
            a = 0;
        }
        if( a > 0) {
            for (int i = 0; i < a; i++) {
                s = s + "I";
            }
        }
        return s;
    }
    public static void main(String[] args){
        IntToRoman i2r = new IntToRoman();
        System.out.println(i2r.intToRoman(20));
    }
}
