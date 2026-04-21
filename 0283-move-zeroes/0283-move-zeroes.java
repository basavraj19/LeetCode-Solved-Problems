class Solution {
    public void moveZeroes(int[] nums) {
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (ind != i) {
                    int t = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = t;
                }
                ind++;
            }
        }
    }
}