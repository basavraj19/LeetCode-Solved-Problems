class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            ans.add("Push");
            if(!(target[j]==i)){
                ans.add("Pop");
             }else{
                  j++;   
             }
             if(target[target.length-1]==i) return ans;
        }
            return ans;
    }
}