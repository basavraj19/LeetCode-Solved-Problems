class Solution {
    public int trap(int[] height) {
        int storedWater = 0,  leftMax =0; 
        for (int i = 0; i < height.length; i++) {
            leftMax = Math.max(leftMax, height[i]);
            int rightMax = getMax(height, i, height.length - 1);
            storedWater += Math.min(leftMax, rightMax) - height[i];
        }

        return storedWater;
    }

    public int getMax(int nums[], int left, int right) {
        int max = 0;
        for (int i = left; i <= right; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}