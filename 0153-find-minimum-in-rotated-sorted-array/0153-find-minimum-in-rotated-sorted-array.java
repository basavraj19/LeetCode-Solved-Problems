class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1, min = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[i] <= nums[j]) {
                return Math.min(min, nums[i]);
            } else if (nums[i] <= nums[mid]) {
                min = Math.min(min, nums[i]);
                i = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                j = mid - 1;
            }
        }
        return min;
    }
}