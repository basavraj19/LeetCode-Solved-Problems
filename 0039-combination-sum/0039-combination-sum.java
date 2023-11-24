class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer>arr=new ArrayList<>();
        return solve(candidates,target,arr,ans,0,0);
    }
    public List<List<Integer>> solve(int a[],int t,List<Integer>arr,List<List<Integer>> ans,int i,int s){
        if(i>=a.length){
            if(s==t){
                ans.add(new ArrayList<Integer> (arr));
            }
            return ans;
        }
        if(s>t){
            return ans;
        }
        s+=a[i];
        arr.add(a[i]);
        ans=solve(a,t,arr,ans,i,s);
        s-=a[i];
        arr.remove(arr.size()-1);
        ans=solve(a,t,arr,ans,i+1,s);
        return ans;
    }
}