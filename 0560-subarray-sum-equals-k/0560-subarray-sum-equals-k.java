class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>  map = new HashMap<>();

        int s=0, c=0;
        for(int i=0;i<nums.length;i++) {
            s+=nums[i];
            if(s==k) {
                c++;
            }
            if(map.containsKey(s-k)) {
                c+=map.get(s-k);
            }
            map.put(s,map.getOrDefault(s, 0)+1);
        }

        return c;
    }
}