class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()&&Math.abs(s.charAt(i)-stack.peek())==32){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        s="";
        while(stack.size()>0){
            s=stack.peek()+s;
            stack.pop();
        }
        return s;
    }
}

// TC O(n) and SC O(n)
