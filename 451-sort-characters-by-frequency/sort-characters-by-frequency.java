class Solution {
    public String frequencySort(String s) {
        int a[][] = new int[123][2];

        for (int i = 0; i < s.length(); i++) {
            int ind = (int) s.charAt(i);
            a[ind - 1][0] = ind;
            a[ind - 1][1]++;
        }

        Arrays.sort(a, (p, q) -> Integer.compare(q[1], p[1]));

        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (a[i][1] != 0) {
            for (int j = 0; j < a[i][1]; j++) {
                ans.append((char) a[i][0]);
            }
            i++;
        }

        return ans.toString();
    }
}