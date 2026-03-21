class Solution {
    public void setZeroes(int[][] m) {
        int a[][] = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                a[i][j] = m[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    solve(m, i, j);
                }
            }
        }
    }

    public void solve(int m[][], int row, int col) {
        for (int i = 0; i < m[0].length; i++) {
            m[row][i] = 0;
        }

        for (int i = 0; i < m.length; i++) {
            m[i][col] = 0;
        }
    }
}