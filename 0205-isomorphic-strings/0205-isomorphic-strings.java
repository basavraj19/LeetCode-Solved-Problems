class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            
            if(map1.containsKey(ch)){
              if(map1.get(ch)!=ch1){
                  return false;
              }  
            }
            else {
                if(map2.containsKey(ch1)){
                    return false;
                }
                map1.put(ch,ch1);
                map2.put(ch1,ch);
            }
        }
        return true;
    }
}