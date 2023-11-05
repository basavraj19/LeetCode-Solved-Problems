class Solution {
    public int getWinner(int[] a, int k) {
        int count=0;
        for(int i=1;i<a.length;i++){
            if(a[0]>a[i]){
                count++;
            }else {
                int t=a[i];
                a[i]=a[0];
                a[0]=t;
                count=0;
                count++;
            }
            if(count==k){
                return a[0];
            }
        }
         return a[0];
    }
}