class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int a=0;
       for(int i=0;i<prices.length;i++){
          min=Math.min(min,prices[i]);
          a=prices[i]-min;
          max=Math.max(max,a);
       }
      return max<0? 0:max;
    }
}