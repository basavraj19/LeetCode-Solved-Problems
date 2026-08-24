class Solution {
    public int romanToInt(String s) {
        int ans = getValue(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            int val1 = getValue(s.charAt(i));
            int val2 = getValue(s.charAt(i + 1));
            if (val2 <= val1) {
                ans += val1;
            } else {
                ans -= val1;
            }
        }
        return ans;
    }

    private int getValue(char s) {
        int ans;
        switch (s) {
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