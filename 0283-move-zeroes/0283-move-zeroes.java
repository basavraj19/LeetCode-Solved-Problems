class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0, i=0;
       while(i<nums.length-c) {
        if(nums[i] == 0) {
            int j = i+1;
            while(j<nums.length-c) {
                nums[j-1] = nums[j];
                j++;
            }
            nums[nums.length-c-1] = 0;
            c++;
        }else {
            i++;
        }
       } 
    }
}