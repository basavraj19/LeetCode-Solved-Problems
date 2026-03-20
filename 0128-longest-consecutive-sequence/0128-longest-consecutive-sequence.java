class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
       Arrays.sort(nums);
       int lastSmall = nums[0], count = 1, max =1; 
       for(int i=0;i<nums.length;i++) {
        if(nums[i] - 1 == lastSmall) {
            count++;
            lastSmall = nums[i];
        }else if(nums[i] != lastSmall) {
            count = 1;
            lastSmall = nums[i];
        }
         max = Math.max(max, count);
       }

       return max;
    }
}