class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = solve(i);
            ans.add(new ArrayList<>(arr));
        }
        return ans;
    }

    public List<Integer> solve(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        int ans = 1, p = 1, q = 1;
        for (int i = 1; i <= n; i++) {
            p = p * (n - i + 1);
            q = q * i;
            ans = p / q;
            arr.add(ans);
        }

        return arr;
    }
}