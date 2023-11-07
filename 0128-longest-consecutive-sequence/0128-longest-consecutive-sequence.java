class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,count=0,m=Integer.MIN_VALUE;
        if(n==0||n==1){
            return n;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }else if(nums[i]==nums[i+1]-1){
                count++;
                m=Math.max(m,count);
            }else{
                count++;
                m=Math.max(m,count);
                count=0;
            }
        }
        int i=n-1;
         if(nums[i]==nums[i-1]+1){
                count++;
                m=Math.max(m,count);
            }else{
                count++;
                m=Math.max(m,count);
            }
        return m;
    }
}