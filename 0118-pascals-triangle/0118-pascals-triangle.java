class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans= new ArrayList<List<Integer>>();
        List<Integer> arr =new ArrayList<Integer>();
        arr.add(1);
        ans.add(arr);
       for(int i=2;i<=numRows;i++){
          arr= new ArrayList<Integer>();
          arr.add(1);
          for(int j=2;j<=i;j++){
              arr.add(generateNumber(i-1,j-1));
          }
           ans.add(arr);
       }
       return ans;
    }
    public int generateNumber(int n,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}