public class Sqrt {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x) end = mid - 1;
            else if ((long) mid * mid == x) return mid;
            else start = mid + 1;
        }
        return Math.round(end);
    }
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println("The result ");
        System.out.println(sqrt.mySqrt(2147483647));

    }
}
