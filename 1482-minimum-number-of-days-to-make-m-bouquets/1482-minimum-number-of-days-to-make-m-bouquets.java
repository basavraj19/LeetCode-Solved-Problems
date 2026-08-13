class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long noOfflowersRequired = (long) m * k;
        if (noOfflowersRequired > bloomDay.length) {
            return -1;
        }

        int low = 0, high = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isbouquetFormed(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean isbouquetFormed(int bloomDay[], int mid, int m, int k) {
        int count = 0, p = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                count++;
                if (count == k) {
                    p++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        if (p >= m) {
            return true;
        }

        return false;
    }
}