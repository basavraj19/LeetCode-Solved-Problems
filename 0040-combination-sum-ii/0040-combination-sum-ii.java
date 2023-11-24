class Solution {
    
   public List<List<Integer>> ans=new ArrayList<>();
    
    public void result(int a[],int t,List<Integer> arr,int i,int s)
    {
         if(t==s)
            {
                ans.add(new ArrayList<Integer>(arr));
                return;
            }
        
        for(int j=i;j<a.length;j++)
        {
            if(j>i&&a[j]==a[j-1])
            {
                continue;
            }
            if(s>t) break;
            if(s<=t)
              {
               s+=a[j];
               arr.add(a[j]);
               result(a,t,arr,j+1,s);
               s-=a[j];
               arr.remove(arr.size()-1);   
            }
        }
    }
              
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(candidates);
        result(candidates,target,arr,0,0);
        return ans;
    }
}