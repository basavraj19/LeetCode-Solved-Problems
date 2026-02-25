class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicateCount=0, j=0, i=0;
        while(i<nums.length-duplicateCount-1) {
            if(nums[i] == nums[i+1]) {
             j = i+1;
             while(j<nums.length-duplicateCount-1) {
                int temp = nums[j];
                  nums[j] = nums[j+1];
                  nums[j+1] = temp;
                  j++;
             }
             duplicateCount++;

            }else {
                i++;
            }
        }

        return nums.length-duplicateCount;
    }
}