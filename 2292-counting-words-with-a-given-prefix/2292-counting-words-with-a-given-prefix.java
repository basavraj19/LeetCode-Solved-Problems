class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=pref.length()&&isValidPrefix(words[i], pref)){
                count++;
            }
        }
        return count;
    }

    public boolean isValidPrefix(String s, String str){
        int j=0;
        for(int i=0;i<str.length();i++){
            if(s.charAt(j)!=str.charAt(i)){
                return false;
            }
            j++;
        }
        return true;
    }
}