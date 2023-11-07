class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,count=1,m=Integer.MIN_VALUE;
        if(n==0||n==1){
            return n;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
              if(nums[i]==nums[i-1]+1){
                count++;
            }else{
                m=Math.max(m,count);
                count=1;
            }
           }
        }
        return Math.max(m,count);
    }
}