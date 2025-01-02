class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[]= new int[queries.length];
        int a[]= check(words);
        
        for(int i=0;i<queries.length;i++){
         int j=queries[i][0];
         if(j==0){
           ans[i]=a[queries[i][1]]; 
         }else{
           ans[i]=a[queries[i][1]]-a[j-1];
         }  
        }
        return ans;
    }

    public int[] check(String[] words){
       int a[]= new int[words.length];
        for(int i=0;i<words.length;i++){
            int s=words[i].length()-1;
            if((words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')&&(words[i].charAt(s)=='a'||words[i].charAt(s)=='e'||words[i].charAt(s)=='i'||words[i].charAt(s)=='o'||words[i].charAt(s)=='u')){
               if(i==0){
                 a[i]=1;
               }else{
                 a[i]=a[i-1]+1;
               }
            }else{
                if(i==0){
                 a[i]=0;
               }else{
                 a[i]=a[i-1];
               }
            }
        }
        return a;
    }
}