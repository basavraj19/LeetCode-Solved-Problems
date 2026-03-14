class Solution {
    public int maxProfit(int[] prices) {
        int minStockP = Integer.MAX_VALUE, maxP = 0, p = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minStockP) {
                minStockP = prices[i];
            }

            p = prices[i] - minStockP;
           
            maxP = Math.max(maxP, p);
        }

        return maxP;
    }
}