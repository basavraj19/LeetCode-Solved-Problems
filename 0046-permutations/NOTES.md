Approach 1 : TC : O(n!) and SC : O(n)​

class Solution {
    public List<List<Integer>> ans =new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int b[]=new int[nums.length];
        getPermutation(arr,nums,b);
        return ans;
    }
    public void getPermutation(List<Integer> arr,int a[],int b[]){
        if(arr.size()==a.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(b[i]==1){
                continue;
            }
            arr.add(a[i]);
            b[i]=1;
            getPermutation(arr,a,b);
            arr.remove(arr.size()-1);
            b[i]=0;
        }
    }
}
