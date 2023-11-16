class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<Math.pow(2,n);i++){
            String s=Integer.toBinaryString(i);
            if(!map.containsKey(s)&&s.length()==n){
                return s; 
            }
        }
        return "00";
    }
}