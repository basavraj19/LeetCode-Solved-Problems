class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1,k=0;
        while(i<=j){
            if(nums[i]==0){
              int t=nums[i];
              nums[i]=nums[k];
              nums[k]=t;
              k++;
            }
            if(nums[i]==2){
              int t=nums[i];
              nums[i]=nums[j];
              nums[j]=t;
              j--;
              continue;
            }
            i++;
        }
    }
}