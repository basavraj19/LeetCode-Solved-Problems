class Solution {
    public boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int dp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                dp++;
            }
            if (dp > 1) {
                return false;
            }
        }

        return true;
    }
}