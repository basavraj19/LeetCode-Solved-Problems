class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> a=new ArrayList<>();
        int p=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
           if(isVowel(ch[i])){
             a.add(ch[i]);
           }
        }
        Collections.sort(a);
        for(int i=0;i<ch.length;i++){
            if(isVowel(ch[i])){
                ch[i]=a.get(p);
                p++;
            }
        }
        
         return new String(ch);  
    }
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}