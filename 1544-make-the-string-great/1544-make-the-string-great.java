class Solution {
    public String makeGood(String s) {
        while(true){
            int res=isGoodString(s);
            if(res==-1)
            {
                return s;
            }else{
                s=s.substring(0,res)+s.substring(res+2,s.length());
            }
        }
    }
    public int isGoodString(String s){
        for(int i=0;i<s.length()-1;i++){
            int val1=(int)s.charAt(i);
            int val2=(int)s.charAt(i+1);
            if(Math.abs(val1-val2)==32){
                return i;
            }
        }
        return -1;
    }
}