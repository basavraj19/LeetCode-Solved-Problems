class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossibleToSplit(nums, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean isPossibleToSplit(int nums[], int k, int mid) {
        int sum = 0, count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + sum <= mid) {
                sum += nums[i];
            } else {
                count++;
                sum = nums[i];
            }
        }
        if (count <= k) {
            return true;
        }

        return false;
    }
}