class Solution {
    public void setZeroes(int[][] m) {
        int x=0,y=0;
        
        for(int i=0;i<m[0].length;i++){
            if(m[0][i]==0){
                x=1;
            }
        }
        
        for(int j=0;j<m.length;j++){
            if(m[j][0]==0){
                y=1;
            }
        }
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    m[i][0]=0;
                    m[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<m.length;i++){
            for(int j=1;j<m[0].length;j++){
                if(m[0][j]==0||m[i][0]==0){
                    m[i][j]=0;
                }
            }
        }
        
        if(x==1){
          for(int i=0;i<m[0].length;i++){
              m[0][i]=0;
          }   
        }
        if(y==1){
             for(int i=0;i<m.length;i++){
              m[i][0]=0;
          }  
        }
    }
}