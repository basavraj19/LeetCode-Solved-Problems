class Solution {
    public int majorityElement(int[] nums) {
       int res=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                res=nums[i];
                c++;
            }else if(nums[i]==res){
                c++;
            }else{
                c--;
            }
        }
        return res;
    }
}