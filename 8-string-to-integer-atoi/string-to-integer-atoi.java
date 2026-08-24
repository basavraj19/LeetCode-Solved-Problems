class Solution {
    public int myAtoi(String s) {
        boolean flag = true;
        long ans = 0;
        int val = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' && flag) {
                continue;
            }

            if (ch == '-' && flag) {
                flag = false;
                val = -1;
                continue;
            }

            if (ch == '+' && flag) {
                flag = false;
                continue;
            }

            if (ch >= '0' && ch <= '9') {
                flag = false;
                int digit = ch - '0';

                // Check overflow before ans * 10
                if (ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 && digit > 7)) {

                    return val == 1
                            ? Integer.MAX_VALUE
                            : Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
            } else {
                break;
            }
        }

        ans = ans * val;

        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }
}