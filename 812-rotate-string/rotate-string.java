class Solution {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int n = s.length();

        for (int rotation = 0; rotation < n; rotation++) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (goal.charAt((i + rotation) % n) != s.charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                return true;

        }

        return false;

    }
}