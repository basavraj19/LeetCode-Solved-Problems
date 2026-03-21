class Solution {
    public void setZeroes(int[][] m) {
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if ((i == 0 || j == 0) && m[i][j] == 0) {
                    k = 1;
                } else if (m[i][j] == 0) {
                    m[i][0] = 0;
                    m[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[0].length; j++) {
                if (m[i][0] == 0 || m[0][j] == 0) {
                    m[i][j] = 0;
                }
            }
        }

        if (k == 1) {
            for (int i = 0; i < m.length; i++) {
                m[i][0] = 0;
            }

            for (int i = 0; i < m[0].length; i++) {
                m[0][i] = 0;
            }
        }
    }
}