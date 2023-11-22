class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
            int j=0,k=nums.size()-1;
            while(j<k){
                int s=nums.get(j)+nums.get(k);
                if(s<target){
                    count+=k-j;
                    j++;
                }else {
                    k--;
                }
             }
        return count;
    }
}