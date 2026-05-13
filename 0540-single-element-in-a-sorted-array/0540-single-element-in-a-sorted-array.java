class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1, mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid < nums.length - 1 && nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else if (mid > 0 && nums[mid - 1] == nums[mid]) {
                if ((mid - 1) % 2 == 0) {
                    low = mid + 1;
                } else {
                    high = mid - 2;
                }
            } else {
                return nums[mid];
            }
        }

        return -1;
    }
}