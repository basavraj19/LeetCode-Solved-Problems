class Solution {
    public int[] sortArray(int[] nums) {
      return solve(nums,0,nums.length-1);   
    }
    public int[] solve(int a[],int l,int h){
        if(l>=h){
            return a;
        }
        int m=(l+h)/2;
        a=solve(a,l,m);
        a=solve(a,m+1,h);
        a=merge(a,l,m,h);
        return a;
    }
    public int[] merge(int a[],int l,int m,int h){
        int i=l,j=m+1;
        List<Integer> arr=new ArrayList<>();
        while(i<=m&&j<=h){
            if(a[i]>a[j]){
                arr.add(a[j]);
                j++;
            }else{
                arr.add(a[i]);
                i++;
            }
        }
        while(i<=m){
            arr.add(a[i]);
            i++;
        }
        while(j<=h){
            arr.add(a[j]);
            j++;
        }
         
        for(i=l;i<=h;i++){
         a[i]=arr.get(i-l);   
        }
        return a;
    }
}