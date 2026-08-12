class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;
        for (int i = 0; i < s.length(); i++) {
            if (check(str, i, goal)) {
                return true;
            }
        }
        return false;
    }

    public boolean check(String str, int ind, String goal) {
        int i = 0;
        while (i < goal.length()) {
            if (str.charAt(i + ind) != goal.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}