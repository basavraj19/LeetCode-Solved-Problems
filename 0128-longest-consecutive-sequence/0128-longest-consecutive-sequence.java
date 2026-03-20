class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
       
        TreeSet<Integer>  set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
           set.add(nums[i]);
        }
        
        int count = 1, max = 1;
        Integer cur = set.first();

        for(Integer val : set) {
            if(val-cur == 0) {
                cur = val;
                continue;
            }
            if(val-cur == 1) {
                count++;
                max  = Math.max(max, count);
            }else{
                count = 1;
            }
            cur = val;
        }
      
        return max;
    }
}