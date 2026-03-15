class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getAllPermutations(nums, ans, 0);
        return ans;
    }

    public void getAllPermutations(int nums[], List<List<Integer>> ans, int ind) {
        if (ind >= nums.length) {
            List<Integer> arr = Arrays.stream(nums).boxed().toList();
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            int t = nums[ind];
            nums[ind] = nums[i];
            nums[i] = t;
            getAllPermutations(nums, ans, ind+1);
            t = nums[ind];
            nums[ind] = nums[i];
            nums[i] = t;
        }
    }
}