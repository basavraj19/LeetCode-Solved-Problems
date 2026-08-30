class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                ans += getBeautyOfSubstring(s, i, j);
            }
        }

        return ans;
    }

    private int getBeautyOfSubstring(String s, int low, int high) {
        int a[] = new int[26];
        for (int i = low; i <= high; i++) {
            int temp = s.charAt(i) - 'a';
            a[temp]++;
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < 26; i++) {
            if (a[i] == 0) {
                continue;
            }
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        return max - min;
    }
}