class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 1, max = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - nums[i] == 0) {
                continue;
            }else if (nums[i + 1] - nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        return max;
    }
}