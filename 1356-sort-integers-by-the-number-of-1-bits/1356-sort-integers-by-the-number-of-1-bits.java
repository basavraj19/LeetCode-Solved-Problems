class Solution {
    public int[] sortByBits(int[] a) {
        int b[]=oneCount(a);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(b[i]>=b[j]){
                    if(b[i]==b[j]){
                    if(a[i]>a[j]){
                      int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                        continue;   
                    }
                        continue;
                    }
                    int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            
            }
        }
        return a;
    }
    public int[] oneCount(int arr[]){
         int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int p=arr[i],c=0;
            while(p>0){
               if(p%2==1){
                   c++;
               }
                p=p/2;
            }
            a[i]=c;
        }
        return a;
    }
}