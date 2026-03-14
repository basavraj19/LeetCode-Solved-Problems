class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0) {
                posList.add(nums[i]);
            }else {
                negList.add(nums[i]);
            }
        }
       int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) {
                nums[i] = posList.get(j++);
            }else{
                nums[i] = negList.get(k++);
            }
        }

        return nums;
    }
}