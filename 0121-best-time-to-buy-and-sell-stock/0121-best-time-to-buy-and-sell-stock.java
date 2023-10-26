class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=Integer.MIN_VALUE;
        int a=0;
       for(int i=1;i<prices.length;i++){
          min=Math.min(min,prices[i]);
          a=prices[i]-min;
          max=Math.max(max,a);
       }
      return max<0? 0:max;
    }
}