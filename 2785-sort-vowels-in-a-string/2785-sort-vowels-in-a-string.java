class Solution {
    public String sortVowels(String s) {
        int a[]=new int[52];
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
           if(isVowel(ch[i])){
              if(ch[i]>=65&&ch[i]<=92){
                  a[ch[i]-'A']+=1;
              }else{
                  a[ch[i]-'a'+26]+=1;
              }
           }
        }
        for(int i=0;i<s.length();i++){
            if(isVowel(ch[i])){
                int k=0;
                while(k<a.length){
                    if(a[k]!=0){
                        a[k]-=1;
                        break;
                    }
                    k++;
                }
                 if(k<=25){
                 ch[i]=(char)(k+65);
                 }else {
                 ch[i]=(char)(k+97-26);
                 }
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