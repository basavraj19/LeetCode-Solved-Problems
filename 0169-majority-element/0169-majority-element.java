class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int c=0,i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            {
                c++;
            }else
            {
                if(c>=nums.length/2) return nums[i];
                c=0;
            }
        }
           if(nums[i]==nums[i-1])
            {
                c++;
            }else
            {
                if(c>=nums.length/2) return nums[i];
                c=0;
            }
        return nums[i];
    }
}