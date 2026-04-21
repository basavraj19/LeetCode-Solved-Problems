class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            if (c > nums.length / 3 && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}