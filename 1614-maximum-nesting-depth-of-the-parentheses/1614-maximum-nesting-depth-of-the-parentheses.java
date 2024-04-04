class Solution {
    public int maxDepth(String s) {
        int maxDepth=0,count=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
               count++;
           }
           if(s.charAt(i)==')'){
               count--;
           }
           maxDepth=Math.max(maxDepth,count);
       } 
        return maxDepth;
    }
}