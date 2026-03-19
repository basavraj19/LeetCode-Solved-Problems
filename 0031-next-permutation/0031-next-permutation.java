class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        for(int i=nums.length-1;i>0;i--) {
            if(nums[i-1] < nums[i]) {
                ind = i-1;
                break;
            }
        }

        if(ind == -1) {
            reverse(nums, 0, nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>ind;i--) {
            if(nums[i] > nums[ind]) {
                int t= nums[i];
                nums[i] = nums[ind];
                nums[ind] = t;
                break;
            }
        }

        reverse(nums, ind+1, nums.length-1);
    }

    public void reverse(int nums[], int i, int j) {
        while (i <= j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}