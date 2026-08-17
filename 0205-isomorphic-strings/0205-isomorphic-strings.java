class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int a[] = new int[256];
        int b[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int asciiCodeS = (int) s.charAt(i);
            if (a[asciiCodeS] == 0) {
                int asciiCodeT = (int) t.charAt(i);
                if (b[asciiCodeT] == 0) {
                    b[asciiCodeT] = 1;
                    a[asciiCodeS] = asciiCodeT;
                } else {
                    return false;
                }
            } else {
                char ch = (char) a[asciiCodeS];
                if (t.charAt(i) != ch) {
                    return false;
                }
            }
        }

        return true;
    }
}