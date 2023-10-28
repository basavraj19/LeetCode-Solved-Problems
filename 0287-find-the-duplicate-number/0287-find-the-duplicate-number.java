class Solution {
    public int findDuplicate(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(a[nums[i]]==1){
                return nums[i];
            }
           a[nums[i]]=1;
        }
        return -1;
    }
}