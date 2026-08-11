class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[256];
        int[] taken = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            int asciiCode = (int) s.charAt(i);
            if (map[asciiCode] == 0) {
                int ind = (int) t.charAt(i);
                if (taken[ind] == 0) {
                    taken[ind] = asciiCode;
                    map[asciiCode] = ind;
                } else {
                    return false;
                }
            } else {
                if (t.charAt(i) != (char) map[asciiCode]) {
                    return false;
                }
            }
        }
        return true;
    }
}