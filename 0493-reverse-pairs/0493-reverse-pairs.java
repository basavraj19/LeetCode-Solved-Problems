class Solution {
    public int reversePairs(int[] nums) {
        return merge(nums,0,nums.length-1); 
    }
    public int merge(int a[],int l,int h){
        int c=0;
       if(l>=h) return c;
        int m=(l+h)/2;
        c+=merge(a,l,m);
        c+=merge(a,m+1,h);
        c+=countPairs(a,l,m,h);
        a=mergeSort(a,l,m,h);
        return c;
    }
    public int[] mergeSort(int a[],int l,int m,int h){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int i=l,j=m+1;
        while(i<=m&&j<=h){
            if(a[i]>a[j]){
                arr.add(a[j]);
                j++;
            }else
            {
                arr.add(a[i]);
                i++;
            }
        }
        while(i<=m){
            arr.add(a[i++]);
        }
        while(j<=h){
            arr.add(a[j++]);
        }
        for(i=l;i<=h;i++){
            a[i]=arr.get(i-l);
        }
        return a;
    } 
    public int countPairs(int a[],int l,int m,int h){
        int i=l,j=m+1,res=0;
        for(i=l;i<=m;i++){
            while(j<=h&&(long)a[i]>(2l*a[j])){
                j++;
            }
            res+=j-(m+1);
        }
        return res;
    }
}