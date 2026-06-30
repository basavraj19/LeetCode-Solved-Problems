class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length - 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1, l = n;

                while (k < l) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
                        while (k < l && nums[k] == nums[k + 1]) {
                            k++;
                        }
                        while (l > k && nums[l] == nums[l - 1]) {
                            l--;
                        }

                        k++;
                        l--;
                    } else if (target > sum) {
                        while (k < l && nums[k] == nums[k + 1]) {
                            k++;
                        }
                        k++;
                    } else {
                        while (l > k && nums[l] == nums[l - 1]) {
                            l--;
                        }
                        l--;
                    }
                }
            }
        }

        return ans;
    }
}