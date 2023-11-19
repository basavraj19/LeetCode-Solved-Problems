class Solution {
    public int reductionOperations(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                continue;
            }
             count+=nums.length-i;
        }
        return count;
    }
}