class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrom(s, i, j)) {
                    if ((end - start) < (j - i)) {
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return s.substring(start, end+1);
    }

    private boolean isPalindrom(String s, int i, int j) {
        int low = i, high = j;
        while (low <= high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}