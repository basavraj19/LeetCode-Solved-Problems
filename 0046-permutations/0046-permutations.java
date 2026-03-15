class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int vis[] = new int[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        getAllPermutations(nums, vis, arr, ans);
        return ans;
    }

    public void getAllPermutations(int nums[], int vis[], List<Integer> arr, List<List<Integer>> ans) {
        if (arr.size() == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vis[i] != 1) {
                arr.add(nums[i]);
                vis[i] = 1;
                getAllPermutations(nums, vis, arr, ans);
                vis[i] = 0;
                arr.remove(arr.size() - 1);
            }
        }
    }
}