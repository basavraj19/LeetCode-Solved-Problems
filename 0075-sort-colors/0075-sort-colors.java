class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1, t = 0;
        while (j <= k) {
            if (nums[j] == 0) {
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
            } else if (nums[j] == 2) {
                t = nums[j];
                nums[j] = nums[k];
                nums[k] = t;
                k--;
                continue;
            }
            j++;
        }
    }
}