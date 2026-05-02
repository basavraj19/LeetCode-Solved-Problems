class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int nums[], int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            count += mergeSort(nums, start, mid);
            count += mergeSort(nums, mid + 1, end);
            count += countPairs(nums, start, mid, end);
            merge(nums, start, mid, end);
        }

        return count;
    }

    private void merge(int nums[], int start, int mid, int end) {
        int i = start, j = mid + 1, ind = 0;
        int temp[] = new int[end - start + 1];

        while (i <= mid && j <= end)
        {
            if (nums[i] > nums[j]) {
                temp[ind++] = nums[j++];
            } else
                temp[ind++] = nums[i++];
        }

        while (i <= mid) {
            temp[ind++] = nums[i++];
        }

        while (j <= end) {
            temp[ind++] = nums[j++];
        }

        for (i = 0; i < (end - start + 1); i++) {
            nums[start + i] = temp[i];
        }
    }

    private int countPairs(int nums[], int start, int mid, int end) {
        int j = mid + 1, count = 0;
        for (int i = start; i <= mid; i++) {
            int val = (int) Math.ceil(nums[i] / 2.0);
            while (j <= end && val > nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        return count;
    }
}