class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                posList.add(nums[i]);
            } else {
                negList.add(nums[i]);
            }
        }

        int i = 0, j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (k % 2 == 0) {
                nums[k] = posList.get(i++);
            } else {
                nums[k] = negList.get(j++);
            }
        }

        return nums;
    }
}