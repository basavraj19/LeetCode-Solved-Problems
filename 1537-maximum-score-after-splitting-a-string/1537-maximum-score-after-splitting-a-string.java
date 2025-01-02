class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
      for(int i=1;i<s.length();i++){
        int left = countZero(s.substring(0,i));
        int right = countOne(s.substring(i,s.length()));
        max=Math.max(max,left+right);
      }  
      return max;
    }

    public int countZero(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') count++;
        }
        return count;
    }

    public int countOne(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') count++;
        }
        return count;
    }
}