class Solution {
    public int maxDepth(String s) {
        int maxDepth=0;
        Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
               stack.push(s.charAt(i));
           }
           if(s.charAt(i)==')'){
               stack.pop();
           }
           maxDepth=Math.max(maxDepth,stack.size());
       } 
        return maxDepth;
    }
}