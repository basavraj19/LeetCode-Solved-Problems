class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q=new LinkedList<>();
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            if(q.contains(s.charAt(i))){
                while(q.peek()!=s.charAt(i)){
                    q.remove();
                }
                q.remove();
            }
            q.add(s.charAt(i));
            maxlen=Math.max(maxlen,q.size());
        }
        return maxlen;
    }
}