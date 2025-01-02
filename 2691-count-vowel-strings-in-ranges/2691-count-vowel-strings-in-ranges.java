class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[]= new int[queries.length];
        int a[]= check(words);
        
        for(int i=0;i<queries.length;i++){
         ans[i]=count(a,queries[i][0],queries[i][1]);
        }
        return ans;
    }

    public int count(int a[],int start,int end){
        int count=0;
        for(int i=start;i<=end;i++){
            count+=a[i];
        }
        return count;
    }

    public int[] check(String[] words){
       int a[]= new int[words.length];
        for(int i=0;i<words.length;i++){
            int s=words[i].length()-1;
            if((words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')&&(words[i].charAt(s)=='a'||words[i].charAt(s)=='e'||words[i].charAt(s)=='i'||words[i].charAt(s)=='o'||words[i].charAt(s)=='u')){
               a[i]=1;
            }
            
        }
        return a;
    }
}