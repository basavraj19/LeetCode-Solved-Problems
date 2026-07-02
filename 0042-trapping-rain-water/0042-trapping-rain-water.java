class Solution {
    public int trap(int[] height) {
        int storedWater = 0, leftMax = 0, rightMaxInd = 0;
        for (int i = 0; i < height.length; i++) {
            leftMax = Math.max(leftMax, height[i]);

            if (i >= rightMaxInd) {
                rightMaxInd = getMax(height, i, height.length - 1);
            }

            storedWater += Math.min(leftMax, height[rightMaxInd]) - height[i];
        }

        return storedWater;
    }

    public int getMax(int nums[], int left, int right) {
        int ind = 0, max = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                ind = i;
            }
        }
        return ind;
    }
}