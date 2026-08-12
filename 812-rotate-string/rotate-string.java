class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        StringBuilder ans = new StringBuilder();
        ans.append(s);
        for (int i = 0; i < s.length(); i++) {
            ans.append(ans.charAt(0));
            ans.deleteCharAt(0);

            if (ans.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}