class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j || words[i].length()>words[j].length()) {
                    continue;
                }
                if(isSubstring(words[i], words[j])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }

    public boolean isSubstring(String s, String s1){
        for(int i=0;i<=s1.length()-s.length();i++){
            if(s.equals(s1.substring(i, i+s.length()))) return true;
        }
        return false;
    }
}