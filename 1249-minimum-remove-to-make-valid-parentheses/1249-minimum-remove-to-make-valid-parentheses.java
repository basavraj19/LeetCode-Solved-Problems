class Solution {
    public String minRemoveToMakeValid(String s) {
        int open=0,close=0,flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
                flag++;
            }else if(s.charAt(i)==')'&&flag>0){
                close++;
                flag--;
            }
        }
        int min=Math.min(open,close);
        String ans="";
        open=min;
        close=min;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(open>0){
                    ans+='(';
                    open--;
                }
                continue;
            }
            else if(s.charAt(i)==')'){
                if(close>0&&close>open){
                    ans+=')';
                    close--;
                }
                continue;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}