class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0, p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a++;
            } else if (nums[i] == 1) {
                b++;
            } else {
                c++;
            }
        }

        for (int i = 0; i < a; i++) {
            nums[p++] = 0;
        }

        for (int i = 0; i < b; i++) {
            nums[p++] = 1;
        }

        for (int i = 0; i < c; i++) {
            nums[p++] = 2;
        }
    }

}