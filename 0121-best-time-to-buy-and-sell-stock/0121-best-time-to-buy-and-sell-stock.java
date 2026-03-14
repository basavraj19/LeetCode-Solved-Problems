class Solution {
    public int maxProfit(int[] prices) {
        int minStockP = prices[0], maxP = 0, p = 0;
        for (int i = 1; i < prices.length; i++) {
            p = prices[i] - minStockP;
            maxP = Math.max(maxP, p);
            minStockP = Math.min(prices[i], minStockP);
        }

        return maxP;
    }
}