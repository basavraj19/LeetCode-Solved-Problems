class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        s += s;

        for (int i = 0; i < s.length() - goal.length(); i++) {
            if (isPossible(s, goal, i)) {
                return true;
            }
        }

        return false;
    }

    public boolean isPossible(String s, String goal, int ind) {
        for (int i = 0; i < goal.length(); i++) {
            if (goal.charAt(i) != s.charAt(i + ind)) {
                return false;
            }
        }

        return true;
    }
}