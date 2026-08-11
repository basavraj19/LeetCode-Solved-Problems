class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        StringBuilder ans = new StringBuilder();
        ans.append(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            while (ans.length() > 0 && strs[i].indexOf(ans.toString()) != 0) {
                ans.deleteCharAt(ans.length() - 1);
            }
        }
        return ans.toString();
    }
}