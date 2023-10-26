class Solution {
    public List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
      getAllPermutations(nums,0);
      return ans;
    }
    
    public void getAllPermutations(int nums[],int j){
        if(j==nums.length-1){
            List<Integer> arr =new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);
            }
            ans.add(arr);
        }
        
        for(int i=j;i<nums.length;i++){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            getAllPermutations(nums,j+1);
            t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
    }
}