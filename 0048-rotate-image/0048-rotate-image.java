class Solution {
    public void rotate(int[][] a) {
       for(int i=0;i<a.length-1;i++){
           for(int j=i+1;j<a.length;j++){
               int t=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=t;
           }
       }
       for(int i=0;i<a.length;i++){  
            for(int j=0;j<a.length/2;j++){
                int t=a[i][j];
                a[i][j]=a[i][a.length-1-j];
                a[i][a.length-1-j]=t;
            }
        }
    }
}