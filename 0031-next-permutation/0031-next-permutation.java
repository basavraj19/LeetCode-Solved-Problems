class Solution {
    public void nextPermutation(int[] nums) {
      int idx=-1;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]<nums[i+1]){
               idx=i;
           }
       }
        if(idx==-1){
            int i=0,j=nums.length-1;
        while(i<=j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
            return;
        }
        for(int i=nums.length-1;i>idx;i--){
            if(nums[idx]<nums[i]){
                int t=nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;
                break;
            }
        }
        int i=idx+1,j=nums.length-1;
        while(i<=j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    } 
}