class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0]&&target<=matrix[i][matrix[0].length-1]){
               return search(matrix,i,target);
            }
        }
        return false;
    }
    public boolean search(int [][]a,int i,int t){
        for(int j=0;j<a[i].length;j++){
            if(a[i][j]==t) return true;
        }
        return false;
    }
}