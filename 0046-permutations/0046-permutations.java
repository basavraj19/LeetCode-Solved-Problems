class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int vis[] = new int[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        return getAllPermutations(nums, vis, arr, ans);
     }

    public List<List<Integer>> getAllPermutations(int nums[], int vis[], List<Integer> arr, List<List<Integer>> ans) {
        if(arr.size() == nums.length) {
            ans.add(new ArrayList<>(arr));
            return ans;
        }

        for(int i=0;i<nums.length;i++) {
            if(vis[i] != 1) {
                arr.add(nums[i]);
                vis[i] = 1;
                ans = getAllPermutations(nums, vis, arr, ans);
                vis[i] = 0;
                arr.remove(arr.size()-1);
            }
        }
           return ans;
     }
}