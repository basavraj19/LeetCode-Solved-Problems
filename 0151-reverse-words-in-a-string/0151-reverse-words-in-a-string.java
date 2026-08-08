class Solution {
    public String reverseWords(String s) {
        String ans = "", arr = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (arr.length() > 0) {
                    if (count == 0) {
                        ans = arr + ans;
                    } else {
                        ans = arr + " " + ans;
                    }
                    count++;
                    arr = "";
                }
                continue;
            }
            arr += s.charAt(i);
        }
        if (arr.length() > 0) {
            if (count == 0) {
                ans = arr + ans;
            } else {
                ans = arr + " " + ans;
            }
        }
        return ans;
    }
}