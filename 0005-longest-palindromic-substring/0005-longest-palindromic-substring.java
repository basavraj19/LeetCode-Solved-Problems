class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }
            
            if ((r - l - 1) > ans.length()) {
                ans = new StringBuilder();
                ans.append(s, l + 1, r);
            }

            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }

            if ((r - l - 1)  > ans.length()) {
                ans = new StringBuilder();
                ans.append(s, l + 1, r);
            }
        }

        return ans.toString();
    }
}