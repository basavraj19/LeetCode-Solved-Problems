class Solution {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != goal.charAt((i + j) % n)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return true;
            }
        }
        return false;
    }
}