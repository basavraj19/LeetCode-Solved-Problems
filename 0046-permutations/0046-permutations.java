class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> arr=new ArrayList<>();
        int b[]=new int[nums.length];
        return solve(nums,b,ans,arr);
    }
    public List<List<Integer>> solve(int a[],int b[],List<List<Integer>> ans,List<Integer> arr){
        if(arr.size()==a.length){
            ans.add(new ArrayList<Integer>(arr));
            return ans;
        }
        for(int i=0;i<a.length;i++){
            if(b[i]!=1){
                b[i]=1;
                arr.add(a[i]);
                ans=solve(a,b,ans,arr);
                b[i]=0;
                arr.remove(arr.size()-1);
            }
        }
        return ans;
    }
}