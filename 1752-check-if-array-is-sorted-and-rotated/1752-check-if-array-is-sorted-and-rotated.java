class Solution {
    public boolean check(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1)%nums.length]) {
                d++;
            }
            if(d > 1) {
                return false;
            }
        }

        return true;
    }
}