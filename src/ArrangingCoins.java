public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int rows = 0, i = 1;
        while(n > 0){
            if((n - i) >= 0) {
                rows++;
                n = n - i;
                i++;
            } else break;
        }
        return rows;
    }
    public static void main(String[] args) {
        ArrangingCoins a = new ArrangingCoins();
        System.out.println(a.arrangeCoins(3));
    }
}
