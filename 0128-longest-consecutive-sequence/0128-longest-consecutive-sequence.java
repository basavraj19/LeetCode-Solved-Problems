class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1, max = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (Integer val : set) {
            if (!set.contains(val - 1)) {
                int x = val;
                count = 0;
                while (set.contains(x)) {
                    x++;
                    count++;
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}