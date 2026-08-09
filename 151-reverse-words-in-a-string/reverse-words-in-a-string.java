class Solution {
    public String reverseWords(String s) {
        String ans = "", arr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (ans.length() > 0 && arr.length() > 0) {
                    ans = " " + ans;
                }
                ans = arr + ans;
                arr = "";
                continue;
            }
            arr += s.charAt(i);
        }

        if (ans.length() > 0 && arr.length() > 0) {
            ans = " " + ans;
        }

        ans = arr + ans;

        return ans;
    }
}