public class HappyNumber {
    int s = 0;
    public boolean isHappy(int n) {
        if(n == 1) return true;
        while(n != 1){
            sumOfSquareDigits(n);
            if(n == 1) return true;
        }
        return false;
    }
    void sumOfSquareDigits(int n){
        while(n != 0){
            s += ((n % 10) * (n % 10));
            //n -= (n % 10);
            n /= 10;
        }
        //n = s;
    }
    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(19));
    }
}
