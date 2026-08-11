class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 0; j < str.length; j++) {
                if ( i >= str[j].length() || str[0].charAt(i) != str[j].charAt(i)) {
                    return ans.toString();
                }
            }
            ans.append(str[0].charAt(i));
        }
        return ans.toString();
    }
}