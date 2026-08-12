class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ind = (int) s.charAt(i) - 'a';
            arr[ind] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            int ind = (int) t.charAt(i) - 'a';
            if (arr[ind] == 0) {
                return false;
            }
            arr[ind] = arr[ind] - 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}