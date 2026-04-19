class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                nums[j++] = nums[i];
                map.put(nums[i], i);
            }
        }
        return j;
    }
}