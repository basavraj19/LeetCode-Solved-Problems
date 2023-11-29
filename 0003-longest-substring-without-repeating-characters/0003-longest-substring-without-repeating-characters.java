class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0,maxlen=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}