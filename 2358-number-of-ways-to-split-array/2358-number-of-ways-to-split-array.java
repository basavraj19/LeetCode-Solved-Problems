class Solution {
    public int waysToSplitArray(int[] nums) {
        int validSplitCount=0;
        Long temp[] = new Long[nums.length];
        temp[0]=(long)nums[0];
        for(int i=1;i<nums.length;i++){
            temp[i]=temp[i-1]+nums[i];
        }

        for(int i=0;i<nums.length-1;i++){
            if(temp[i]>=temp[nums.length-1]-temp[i]){
               validSplitCount++;
            }
        }
        return validSplitCount;
    }
}