public class Base7Representation {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        num = Math.abs(num);
        while(num > 0) {
            int rem = num % 7;
            num /= 7;
            sb.append(rem);
        }
        if(isNegative) sb.append("-");
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Base7Representation b = new Base7Representation();
        System.out.println(b.convertToBase7(-999));
    }
}
