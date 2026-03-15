class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> posList = new ArrayList<>();
       List<Integer> negList = new ArrayList<>();

       for(int i=0;i<nums.length;i++){
        if(nums[i] >0) {
            posList.add(nums[i]);
        }else{
            negList.add(nums[i]);
        }
       }

       int i=0,j=0;
       for(int k=0;k<nums.length/2;k++) {
          nums[2*k] = posList.get(i++);
          nums[2*k+1] = negList.get(j++);
       }

       return nums;
    }
}