class Solution {
    public boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int drop = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                drop++;
            }
            if (drop > 1) {
                return false;
            }
        }
        return true;
    }
}