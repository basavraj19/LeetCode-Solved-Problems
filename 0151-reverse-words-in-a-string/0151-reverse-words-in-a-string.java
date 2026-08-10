class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (arr.length() > 0) {
                    if (ans.length() > 0) {
                        ans.insert(0, " ");
                    }
                    ans.insert(0, arr);
                }
                arr = new StringBuilder();
                continue;
            }
            arr.append(s.charAt(i));
        }

        if (arr.length() > 0) {
            if (ans.length() > 0) {
                ans.insert(0, " ");
            }
            ans.insert(0, arr);
        }

        return ans.toString();
    }
}