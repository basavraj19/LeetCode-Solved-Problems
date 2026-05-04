class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        i = Math.min(i, j);
        if (i == -1) {
            i = 0;
        }
        return nums[i] > target ? i : i + 1;
    }
}