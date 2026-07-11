class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 1;
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
        while (low <= high) {
            int ans = 0, mid = low + (high - low) / 2;
            for (int i = 0; i < nums.length; i++) {
                ans += Math.ceil((double) nums[i] / mid);
            }
            if (ans <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}