class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() < 3){
            return "";
        }
        int c = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (c == 0) {
                c++;
            } else {
                if (s.charAt(i) == '(') {
                    c++;
                    ans.append('(');
                } else {
                    c--;
                    if (c != 0) {
                       ans.append(')');
                    }
                }
            }
        }

        return ans.toString();
    }
}