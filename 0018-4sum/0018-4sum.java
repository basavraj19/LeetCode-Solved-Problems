class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long s = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (s == target) {
                        List<Integer> arr = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        if (!ans.contains(arr)) {
                            ans.add(arr);
                        }
                        k++;
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
