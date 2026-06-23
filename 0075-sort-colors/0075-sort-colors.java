class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = 0;
        for (int e = 0; e < nums.length; e++) {
            if (nums[e] == 0) {
                i++;
            } else if (nums[e] == 1) {
                j++;
            } else {
                k++;
            }
        }

        for (int e = 0; e < i; e++) {
            nums[e] = 0;
        }
        for (int e = i; e < i + j; e++) {
            nums[e] = 1;
        }

        for (int e = (i + j); e < nums.length; e++) {
            nums[e] = 2;
        }
    }
}