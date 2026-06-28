class Solution {
    public void nextPermutation(int[] nums) {
        int c = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int ind = findImmediateGreater(nums, i - 1);
                int t = nums[i - 1];
                nums[i - 1] = nums[ind];
                nums[ind] = t;
                reverse(nums, i);
                c++;
                break;
            }
        }

        if (c == 0) {
            reverse(nums, 0);
        }
    }

    public int findImmediateGreater(int nums[], int ind) {
        int ans = -1;
        for (int i = ind+1; i < nums.length; i++) {
            if (nums[i] > nums[ind]) {
                ans = i;
            }else{
                return ans;
            }
        }

        return ans;
    }

    public void reverse(int nums[], int ind) {
        int i = ind, j = nums.length - 1;
        while (i <= j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}