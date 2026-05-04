class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[] { -1, -1 };
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                j = mid - 1;
                ans[0] = mid;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                i = mid + 1;
                ans[1] = mid;
            } else if (nums[i] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return ans;
    }
}