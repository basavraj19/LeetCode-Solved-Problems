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
            for (int i = 0; i < a[j][1]; i++) {
                ans.append((char) a[j][0]);
            }
            j++;
        }

        return ans.toString();
    }
}