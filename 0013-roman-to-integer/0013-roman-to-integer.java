class Solution {

    public int romanToInt(String s) {
        int ans = getVal(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int val = getVal(s.charAt(i));
            int nextVal = getVal(s.charAt(i + 1));
            if (nextVal > val) {
                ans -= val;
            } else {
                ans += val;
            }
        }

        return ans;
    }

    public int getVal(char ch) {
        int ans = 0;
        switch (ch) {
            case 'I':
                ans = 1;
                break;

            case 'V':
                ans = 5;
                break;

            case 'X':
                ans = 10;
                break;

            case 'L':
                ans = 50;
                break;

            case 'C':
                ans = 100;
                break;

            case 'D':
                ans = 500;
                break;

            case 'M':
                ans = 1000;
                break;

            default:
                ans = 0;
        }

        return ans;
    }
}