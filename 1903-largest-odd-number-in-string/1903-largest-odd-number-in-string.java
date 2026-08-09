class Solution {
    public String largestOddNumber(String nums) {
        String ans = "", str = "";
        for (int i = 0; i < nums.length(); i++) {
            char ch = nums.charAt(i);
            str += ch;
            if (!(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9')) {
                continue;
            }
            ans = getMax(ans, str);
        }
        return ans;
    }

    public String getMax(String ans, String str) {
        if (ans.length() > str.length()) {
            return ans;
        } else if (ans.length() < str.length()) {
            return str;
        }

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == str.charAt(i)) {
                continue;
            }
            int v1 = Integer.parseInt(String.valueOf(ans.charAt(i)));
            int v2 = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (v1 > v2) {
                return ans;
            } else {
                return str;
            }
        }
        return ans;
    }
}