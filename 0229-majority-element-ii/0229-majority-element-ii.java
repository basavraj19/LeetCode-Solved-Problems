class Solution {
    public List<Integer> majorityElement(int[] nums) {

        if (nums.length == 1) {
            return new ArrayList<>(Arrays.asList(nums[0]));
        }
        int e1 = nums[0], e2 = nums[0], ec1 = 0, ec2 = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (ec1 == 0 && nums[i] != e2) {
                ec1 = 0;
                e1 = nums[i];
            }
            if (ec2 == 0 && nums[i] != e1) {
                ec2 = 0;
                e2 = nums[i];
            }

            if (e1 == nums[i]) {
                ec1++;
            } else if (e2 == nums[i]) {
                ec2++;
            } else {
                ec1--;
                ec2--;
            }
        }

        ec1 = 0;
        ec2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                ec1++;
            }
            if (nums[i] == e2) {
                ec2++;
            }
        }

        if (ec1 > nums.length / 3) {
            ans.add(e1);
        }

        if (ec2 > nums.length / 3) {
            ans.add(e2);
        }

        return ans;
    }
}