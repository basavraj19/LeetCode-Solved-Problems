class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Map<Long, Integer> map = new HashMap<>();
                for (int k = j + 1; k < n; k++) {
                    Long s = (long) nums[i] + nums[j] + nums[k];
                    long val = (long) target - s;
                    if (map.containsKey(val)) {
                        List<Integer> arr = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], (int) val));
                        Collections.sort(arr);
                        if (!ans.contains(arr)) {
                            ans.add(arr);
                        }
                    }
                    map.put((long)nums[k], k);
                }
            }
        }

        return ans;
    }
}