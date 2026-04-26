class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();
        int n=0;
        int start = intervals[0][0], end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            } else {
               n++;
            }
        }

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
                start = Math.min(intervals[i][0], start);
            } else {
                List<Integer> arr = new ArrayList<>();
                arr.add(start);
                arr.add(end);
                ans.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        List<Integer> arr = new ArrayList<>();
        arr.add(start);
        arr.add(end);
        ans.add(arr);

        int res[][] = new int[n+1][2];
        for (int i = 0; i < n+1; i++) {
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }

        return res;
    }
}