class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                long sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;
                    while (k > j && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    k--;
                } else if (sum < 0) {
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;
                } else {
                    while (k > j && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    k--;
                }
            }
        }

        return ans;
    }
}