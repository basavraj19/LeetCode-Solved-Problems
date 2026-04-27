class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        int left = 0, gap = (int) Math.ceil((double) (m + n) / 2), right = 0;
        while (gap > 0) {
            right = gap;
            while (right < m + n) {
                if (nums1[left] > nums1[right]) {
                    int t = nums1[left];
                    nums1[left] = nums1[right];
                    nums1[right] = t;
                }
                left++;
                right++;
            }

            left = 0;
            if (gap == 1)
                break;
            gap = (int) Math.ceil((double) (gap) / 2);
        }
    }
}