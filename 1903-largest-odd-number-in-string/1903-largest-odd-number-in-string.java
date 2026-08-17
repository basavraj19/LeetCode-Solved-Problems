class Solution {
    public String largestOddNumber(String num) {
        String ans = "";
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (!(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9')) {
                continue;
            }
            ans = num.substring(0, i + 1);
        }

        return ans;
    }
}