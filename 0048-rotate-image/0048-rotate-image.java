class Solution {
    public void rotate(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <= i; j++) {
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length / 2; j++) {
                int t = m[i][j];
                m[i][j] = m[i][m.length - 1 - j];
                m[i][m.length - 1 - j] = t;
            }
        }
    }
}