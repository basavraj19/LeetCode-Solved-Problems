class Solution {
    public void setZeroes(int[][] m) {
        int a[][] =new int[m.length*m[0].length][2];
        int p=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
            {
                if(m[i][j]==0){
                    a[p][0]=i;
                    a[p][1]=j;
                    p++;
                }
            }
        }
        
        for(int i=0;i<p;i++){
            int j=0;
            while(j<m[0].length){
               m[a[i][0]][j]=0;
                j++;
            }
            j=0;
            while(j<m.length){
                m[j][a[i][1]]=0;
                j++;
            }
        }
    }
}