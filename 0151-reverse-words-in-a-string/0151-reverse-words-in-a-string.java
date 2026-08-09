class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            if (ans.length() > 0 && j != i) {
                ans.append(" ");
            }

            ans.append(s, j + 1, i + 1);

            i = j;
        }

        return ans.toString();
    }
}