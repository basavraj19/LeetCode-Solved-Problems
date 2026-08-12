class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        s = s + s;

        for (int i = 0; i < goal.length(); i++) {
            String str = s.substring(i, i + goal.length());
            if (str.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}