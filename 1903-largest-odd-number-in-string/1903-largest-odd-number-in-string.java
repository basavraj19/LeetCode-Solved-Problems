class Solution {
    public String largestOddNumber(String nums) {
        StringBuilder ans = new StringBuilder();

        for (int i = nums.length() - 1; i >= 0; i--) {
            char ch = nums.charAt(i);
            if (!(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9')) {
                continue;
            }
            return ans.append(nums, 0, i + 1).toString();
        }
        return ans.toString();
    }
}