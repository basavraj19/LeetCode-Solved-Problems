class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1, l = n - 1;
                while (k < l) {
                    int s = nums[i] + nums[j] + nums[k] + nums[l];
                    if (s == target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    } else if (s > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
