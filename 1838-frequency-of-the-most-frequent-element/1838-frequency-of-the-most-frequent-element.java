class Solution {
    public int maxFrequency(int[] nums, int k) {
        int max = 0, j = 0;
        long sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            long x = nums[i] * (i - j + 1);
            while (x - sum > k) {
                sum -= nums[j++];
                x -=nums[i];
            }
            
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}