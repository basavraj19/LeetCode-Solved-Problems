class Solution {
    public String minRemoveToMakeValid(String s) {
        boolean remove[]=new boolean[s.length()];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else if(s.charAt(i)==')'){
                if(stack.size()>0){
                    stack.pop();
                }else{
                    remove[i]=true;
                }
            }
        }
        while(stack.size()>0){
           remove[stack.pop()]=true; 
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(!remove[i]){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}