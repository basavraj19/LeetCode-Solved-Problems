class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        return solve(nums,0,ans);
    }
    public List<List<Integer>> solve(int a[],int j,List<List<Integer>> ans){
        if(j==a.length){
            List<Integer> arr =new ArrayList<>();
            for(int i=0;i<a.length;i++){
                arr.add(a[i]);
            }
            ans.add(arr);
            return ans;
        }
        for(int i=j;i<a.length;i++){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            solve(a,j+1,ans);
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        return ans;
    }
}