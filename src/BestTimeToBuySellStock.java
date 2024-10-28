public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuySellStock bst = new BestTimeToBuySellStock();
        System.out.println(bst.maxProfit(new int[]{2,4,1}));
    }
}
