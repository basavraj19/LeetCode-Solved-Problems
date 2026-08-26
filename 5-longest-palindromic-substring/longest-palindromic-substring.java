class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i + 1;
            StringBuilder arr = new StringBuilder();
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                arr.insert(0, s.charAt(l));
                arr.append(s.charAt(r));
                l--;
                r++;
            }

            if (arr.length() > ans.length()) {
                ans = new StringBuilder();
                ans.append(arr);
            }

            l = i - 1;
            r = i + 1;
            arr = new StringBuilder();
            arr.append(s.charAt(i));
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                arr.insert(0, s.charAt(l));
                arr.append(s.charAt(r));
                l--;
                r++;
            }

            if (arr.length() > ans.length()) {
                ans = new StringBuilder();
                ans.append(arr);
            }
        }

        return ans.toString();
    }
}