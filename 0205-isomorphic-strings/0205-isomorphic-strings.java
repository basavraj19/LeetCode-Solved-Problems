class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))&&(t.charAt(i)!=map.get(s.charAt(i)))){
                return false;
            }
            if(isTaken(map,t.charAt(i),s.charAt(i))){
                return false;
            }
            map.put(s.charAt(i),t.charAt(i));
        }
               return true;
    }
    public boolean isTaken(Map<Character,Character> map,char ch,char ch1){
        for(Map.Entry<Character,Character>m: map.entrySet()){
            if(ch==m.getValue()&&m.getKey()!=ch1){
                return true;
            }
        }
        return false;
    }
}