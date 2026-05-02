class Solution {
    public int maxProduct(int[] nums) {
        int i = 0, j = 0, s = 1, max = nums[0];
        while (i < nums.length && j < nums.length) {
            s = s * nums[i];
            if (nums[i] < 0) {
                j = i;
            }

            max = Math.max(s, max);
            if (i == nums.length - 1) {
                s = 1;
                int p = j;
                j = i;
                i = p;
            }
            i++;
        }

        return max;
    }
}