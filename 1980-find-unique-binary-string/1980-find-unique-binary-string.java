class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        return solve(nums.length,map,"");
    }
    public String solve(int n,HashMap<String,Integer>map,String s){
        if(s.length()==n){
            if(!map.containsKey(s)){
                return s;
            }
            return "";
        }
        String r= solve(n,map,s+'0');
        if (!r.isEmpty()) return r;
        return solve(n,map,s+'1');
        
    }
}