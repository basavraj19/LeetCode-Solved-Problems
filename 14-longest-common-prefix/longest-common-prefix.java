class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int n = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            n = Math.min(n, strs[i].length());
        }

        StringBuilder ans = new StringBuilder();

        if (n == 0) {
            return ans.toString();
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch != strs[j].charAt(i)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                return ans.toString();
            }

            ans.append(ch);
        }
        return ans.toString();
    }
}