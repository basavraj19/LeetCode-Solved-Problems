class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = nums[0], e2 = nums[0], c1 = 0, c2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (c1 == 0 && nums[i] != e2) {
                c1++;
                e1 = nums[i];
            } else if (c2 == 0 && nums[i] != e1) {
                c2++;
                e2 = nums[i];
            } else if (nums[i] == e1) {
                c1++;
            } else if (nums[i] == e2) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                c1++;
            }
            if (nums[i] == e2) {
                c2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (c1 > nums.length / 3) {
            if (!ans.contains(e1)) {
                ans.add(e1);
            }
        }

        if (c2 > nums.length / 3) {
            if (!ans.contains(e2)) {
                ans.add(e2);
            }
        }

        return ans;
    }
}