class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       for(int i=0;i<matrix.length;i++){
           if(target>=matrix[i][0]&&target<=matrix[i][matrix[0].length-1]){
              return binarySearch(matrix[i],0,matrix[0].length-1,target);
           }
       }
        return false;
    }
    public boolean binarySearch(int a[],int l,int h,int t){
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==t){
                return true;
            }else if(t>a[m]){
                l=m+1;
            }else
            {
                h=m-1;
            }
        }
        return false;
    }

}