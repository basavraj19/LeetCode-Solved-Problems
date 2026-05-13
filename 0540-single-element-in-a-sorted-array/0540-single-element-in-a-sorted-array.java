class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                c++;
            } else if (c == 1) {
                return nums[i];
            } else {
                c = 1;
            }
        }

        return nums[nums.length - 1];
    }
}