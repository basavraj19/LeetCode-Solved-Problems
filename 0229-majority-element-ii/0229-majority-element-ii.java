class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = nums[0], e2 = nums[0], ec1 = 0, ec2 = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (ec1 == 0 && nums[i] != e2) {
                ec1 = 1;
                e1 = nums[i];
            } else if (ec2 == 0 && nums[i] != e1) {
                ec2 = 1;
                e2 = nums[i];
            } else if (e1 == nums[i]) {
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
            } else if (nums[i] == e2) {
                ec2++;
            }
        }

        if (ec1 > nums.length / 3)
            ans.add(e1);

        if (ec2 > nums.length / 3)
            ans.add(e2);

        return ans;
    }
}