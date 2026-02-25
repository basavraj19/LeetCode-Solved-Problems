class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int b[] = new int[nums.length];
        b[j++] = nums[0];

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
              if(!(b[j-1] == nums[i])) {
                  b[j++] = nums[i]; 
              }
            }else {
                if(!(b[j-1] == nums[i])) {
                    b[j++] = nums[i];
                }
            }
        }

        if(j<=nums.length && b[j-1] != nums[nums.length-1]) {
            b[j++] = nums[nums.length-1];
        }

        for(int i=0;i<j;i++) {
            nums[i] = b[i];
        }
       
        return j;
    }
}