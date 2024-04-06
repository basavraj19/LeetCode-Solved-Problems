class Solution {
    public String minRemoveToMakeValid(String s) {
       char []ch=s.toCharArray();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]=='('){
                c++;
            }else if(ch[i]==')'){
                if(c>0){
                    c--;
                }else{
                    ch[i]='1';
                }
            }
        }
        c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(ch[i]==')'){
                c++;
            }else if(ch[i]=='('){
                if(c>0) {
                    c--;
                }else{
                    ch[i]='1';
                }
            }
        }
        s="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1') continue;
            s+=ch[i];
        }
        return s;
    }
}