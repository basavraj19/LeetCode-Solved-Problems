class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int a[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                int temp = s.charAt(j) - 'a';
                a[temp]++;
                ans += getBeautyOfSubstring(a);
            }
        }

        return ans;
    }

    private int getBeautyOfSubstring(int a[]) {
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