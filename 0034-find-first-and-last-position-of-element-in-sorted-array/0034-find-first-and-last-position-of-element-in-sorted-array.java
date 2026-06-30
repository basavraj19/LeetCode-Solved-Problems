class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstInd = getFirstOccurance(nums, target);
        int lastInd = getLastOccurance(nums, target);
        return new int[] { firstInd, lastInd };
    }

    public int getFirstOccurance(int a[], int target) {
        int i = 0, j = a.length - 1, ind = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (target == a[mid]) {
                ind = mid;
                j = mid - 1;
            } else if (target > a[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ind;
    }

    public int getLastOccurance(int a[], int target) {
        int i = 0, j = a.length - 1, ind = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (target == a[mid]) {
                ind = mid;
                i = mid + 1;
            } else if (target > a[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ind;
    }
}