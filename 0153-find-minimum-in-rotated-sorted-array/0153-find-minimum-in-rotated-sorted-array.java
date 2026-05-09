class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1, ans = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[i] <= nums[j]) {
                return Math.min(ans, nums[i]);
            } else if (nums[i] <= nums[mid]) {
               // ans = Math.min(ans, nums[i]);
                i = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                j = mid - 1;
            }
        }
        return ans;
    }
}