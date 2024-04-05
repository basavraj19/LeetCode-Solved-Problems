class Solution {
    public String makeGood(String s) {
        int i=0;
        while(i<s.length()-1){
            int val1=(int)s.charAt(i);
            int val2=(int)s.charAt(i+1);
            if(Math.abs(val1-val2)==32){
              s=s.substring(0,i)+s.substring(i+2,s.length());
              if(i>0){
                  i--;
              }else{
                  i=0;
              }
              continue;
            }
            i++;
        }
        return s;
    }
}