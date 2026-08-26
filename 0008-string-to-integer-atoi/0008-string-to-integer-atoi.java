class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1;
        long ans = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        for (int j = i; j < s.length(); j++) {
            int asciiCode = (int) s.charAt(j);
            if (asciiCode >= 48 && asciiCode <= 57) {
                int digit = asciiCode - 48;
                ans = ans * 10 + digit;

                if (ans > Integer.MAX_VALUE) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

            } else {
                break;
            }
        }

        return (int) (ans * sign);
    }
}