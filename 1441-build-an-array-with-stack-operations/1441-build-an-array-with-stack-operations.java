class Solution {
    public List<String> buildArray(int[] target, int n) {
        HashMap<Integer,Integer> map=new HashMap<>(); 
        List<String> ans=new ArrayList<>();
      for(int i=0;i<target.length;i++){
          map.put(target[i],1);
      }  
    for(int i=1;i<=n;i++){
      ans.add("Push");
      if(!map.containsKey(i)){
          ans.add("Pop");
      }
        if(target[target.length-1]==i) return ans;
    }
        return ans;
    }
}