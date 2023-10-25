class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans= new ArrayList<List<Integer>>();
       for(int i=0;i<numRows;i++){
         ArrayList<Integer> arr =new ArrayList<Integer>();
         arr.add(1);
         for(int j=0;j<i-1;j++){
            int r= ans.get(i-1).get(j);
            int s= ans.get(i-1).get(j+1);
            arr.add(r+s);
         }
          if(i!=0){
            arr.add(1);
          }
          ans.add(arr);
       }
       return ans;
    }
}