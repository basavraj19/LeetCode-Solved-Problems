class Solution {
    public int[] minOperations(String boxes) {
        int [] ans = new int[boxes.length()];
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
          if(boxes.charAt(i)=='1'){
            arr.add(i);
          }
        }
        for(int i=0;i<boxes.length();i++){
            int s=0;
            for(int j=0;j<arr.size();j++){
                s+=Math.abs(i-arr.get(j));
            }
            ans[i]=s;
        }
        return ans;
    }
}