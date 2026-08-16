class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (c == 0) {
                c++;
            } else {
                if (s.charAt(i) == '(') {
                    c++;
                    ans += s.charAt(i);
                } else {
                    c--;
                    if (c != 0) {
                        ans += s.charAt(i);
                    }
                }
            }
        }

        return ans;
    }
}