class Solution {
    public void rotate(int[][] m) {
        int res[][] = new int[m.length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                res[j][m.length - i - 1] = m[i][j];
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = res[i][j];
            }
        }
    }
}