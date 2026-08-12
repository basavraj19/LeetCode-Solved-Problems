class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(0);
            s = s.substring(1, s.length()) + s.charAt(0);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}