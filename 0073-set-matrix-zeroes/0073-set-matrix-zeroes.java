class Solution {
    public void setZeroes(int[][] matrix) {
       Set<Integer> rowSet = new HashSet<>();
       Set<Integer> colSet = new HashSet<>();

       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                rowSet.add(i);
                colSet.add(j);
            }
        }
       }
       
       for(int ele:rowSet){
        for(int i=0;i<matrix[0].length;i++){
            matrix[ele][i]=0;
        }
       }

    for(int ele:colSet){
        for(int i=0;i<matrix.length;i++){
            matrix[i][ele]=0;
        }
       }
    }
}