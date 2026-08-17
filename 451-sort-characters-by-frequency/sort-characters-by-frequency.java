class Solution {
    public String frequencySort(String s) {
        int a[][] = new int[256][2];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int k = (int) s.charAt(i);
            a[k][0] = k;
            a[k][1]++;
        }

        Arrays.sort(a, (p, q) -> Integer.compare(q[1], p[1]));

        int j = 0;
        while (a[j][1] != 0) {
            ans.append(solve(a[j][0], a[j][1]));
            j++;
        }

        return ans.toString();
    }

    public StringBuilder solve(int asciiCode, int n) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = (char) asciiCode;
            ans.append(ch);
        }

        return ans;
    }
}