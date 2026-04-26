class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = 0, p = 0;
        int start = intervals[0][0], end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            } else {
                end = intervals[i][1];
                n++;
            }
        }
        int res[][] = new int[n + 1][2];
        start = intervals[0][0];
        end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
                start = Math.min(intervals[i][0], start);
            } else {
                res[p][0] = start;
                res[p][1] = end;
                p++;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res[p][0] = start;
        res[p][1] = end;

        return res;
    }
}