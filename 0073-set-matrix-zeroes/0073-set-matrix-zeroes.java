class Solution {
    public void setZeroes(int[][] m) {
        List<Integer> rowZero = new ArrayList<>();
        List<Integer> colZero = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    if (!rowZero.contains(i))
                        rowZero.add(i);
                    if (!colZero.contains(j))
                        colZero.add(j);
                }
            }
        }

        for (int i = 0; i < rowZero.size(); i++) {
            int ind = rowZero.get(i);
            for (int j = 0; j < m[0].length; j++) {
                m[ind][j] = 0;
            }
        }

        for (int i = 0; i < colZero.size(); i++) {
            int ind = colZero.get(i);
            for (int j = 0; j < m.length; j++) {
                m[j][ind] = 0;
            }
        }
    }
}