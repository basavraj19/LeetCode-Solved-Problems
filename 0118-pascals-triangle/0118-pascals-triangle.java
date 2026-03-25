class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            int a[] = new int[i + 1];
            a[0] = 1;
            for (int j = 0; j < i / 2; j++) {
                int nextEle = ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1);
                a[j + 1] = nextEle;
                a[i - j - 1] = nextEle;
            }
            a[i] = 1;
            List<Integer> list = Arrays.stream(a)
                    .boxed()
                    .collect(Collectors.toList());
            ans.add(list);
        }

        return ans;
    }
}