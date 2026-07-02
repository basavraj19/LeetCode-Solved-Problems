class Solution {
    public int trap(int[] height) {
        int storedWater = 0, leftMax = 0, max = 0;
        int rightMax[] = new int[height.length];

        for (int i = rightMax.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }

        for (int i = 0; i < height.length; i++) {
            leftMax = Math.max(leftMax, height[i]);
            storedWater += Math.min(leftMax, rightMax[i]) - height[i];
        }

        return storedWater;
    }
}