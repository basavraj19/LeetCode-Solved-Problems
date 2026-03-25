class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        ans.add(arr);

        for (int i = 1; i < numRows; i++) {
            arr = new ArrayList<>();
            arr.add(1);
            for (int j = 0; j < i - 1; j++) {
                int nextEle = ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1);
                arr.add(nextEle);
            }
            arr.add(1);
            ans.add(arr);
        }

        return ans;
    }
}