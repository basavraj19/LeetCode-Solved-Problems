class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(List.of(1)));
        if (numRows == 1) {
            return ans;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            for (int j = 1; j < i; j++) {
                int res = getValue(i, j);
                arr.add(res);
            }
            arr.add(1);
            ans.add(arr);
        }

        return ans;
    }

    public int getValue(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}