class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if ((nums[i] <= nums[mid] && nums[mid] <= nums[j]) || (nums[i] == nums[mid] || nums[mid] == nums[j])) {
                return Math.min(nums[i], nums[j]);
            } else if (nums[i] <= nums[mid]) {
                i = mid;
            } else {
                j = mid;
            }
        }
        return -1;
    }
}