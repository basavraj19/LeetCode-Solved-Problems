class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int a[] = new int[26];
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int j = i; j < s.length(); j++) {
                int ind = (int) s.charAt(j) - 'a';
                a[ind]++;
                max = Math.max(max, a[ind]);
                min = getSubstringBeautySum(a);
                ans += (max - min);
            }
        }

        return ans;
    }

    private int getSubstringBeautySum(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (a[i] == 0) {
                continue;
            }
            min = Math.min(min, a[i]);
        }
        return min;
    }
}