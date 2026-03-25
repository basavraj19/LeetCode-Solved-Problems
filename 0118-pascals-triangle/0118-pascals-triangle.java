class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i =  1; i <= numRows; i++) {
            List<Integer> arr = solve(i );
            ans.add(arr);
        }

        return ans;
    }

    public List<Integer> solve(int n) {
        int ans = 1;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            arr.add(ans);
        }
        return arr;
    }
}