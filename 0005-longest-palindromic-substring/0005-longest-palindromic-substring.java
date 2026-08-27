class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }

            if ((r - l - 1) > (end - start + 1)) {
                start = l + 1;
                end = r - 1;
            }

            l = r = i;

            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }

            if ((r - l - 1) > (end - start + 1)) {
                start = l + 1;
                end = r - 1;
            }

        }

        return s.substring(start, end + 1);
    }
}