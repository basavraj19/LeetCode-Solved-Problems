class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
               if(stack.size()>0&&stack.peek()=='('){
                   stack.pop();
               }else{
                   return false;
               }
            }else if(s.charAt(i)==']'){
              if(stack.size()>0&&stack.peek()=='['){
                   stack.pop();
               }else{
                   return false;
               }
            }else{
               if(stack.size()>0&&stack.peek()=='{'){
                   stack.pop();
               }else{
                   return false;
               }
            }
        }
        if(stack.size()!=0) return false;
        return true;
    }
  
}