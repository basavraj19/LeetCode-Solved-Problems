class Solution {
    public void rotate(int[][] matrix) {
        int res[][] =new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                res[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[j][matrix.length-1-i]=res[i][j];
            }
        }
        
    }
}