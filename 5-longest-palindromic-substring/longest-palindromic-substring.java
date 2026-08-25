class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrom(s, i, j)) {
                    int t = j - i + 1;
                    if (t > ans.length()) {
                        ans = new StringBuilder();
                        ans.append(s, i, j + 1);
                    }
                }
            }
        }

        return ans.toString();
    }

    public boolean isPalindrom(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}