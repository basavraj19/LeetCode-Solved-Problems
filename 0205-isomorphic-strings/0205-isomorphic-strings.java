class Solution {
    public boolean isIsomorphic(String s, String t) {
        StringBuilder ans = new StringBuilder();
        int[] map = new int[256];
        int[] taken = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int asciiCode = (int) s.charAt(i);
            if (map[asciiCode] == 0) {
                int ind = (int) t.charAt(i);
                if (taken[ind] == 0) {
                    taken[ind] = asciiCode;
                    map[asciiCode] = ind;
                    ans.append(t.charAt(i));
                } else {
                    return false;
                }
            } else {
                char ch = (char) map[asciiCode];
                ans.append(ch);
            }
        }
        return ans.toString().equals(t);
    }
}