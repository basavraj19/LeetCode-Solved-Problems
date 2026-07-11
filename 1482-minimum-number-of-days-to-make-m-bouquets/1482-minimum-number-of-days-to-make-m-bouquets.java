class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long flowerReqToMakeMBoq = (long) m * k;
        if (flowerReqToMakeMBoq > (long) bloomDay.length) {
            return -1;
        }

        int low = 0, high = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isBouquetFormed(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean isBouquetFormed(int bloomDay[], int mid, int m, int k) {
        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                count++;
                if (count == k) {
                    m--;
                    count = 0;
                    if (m == 0) {
                        return true;
                    }
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}