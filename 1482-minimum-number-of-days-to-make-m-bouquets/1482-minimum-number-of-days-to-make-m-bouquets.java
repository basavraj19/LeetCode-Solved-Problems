class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long noOfFlowerRequired = (long) m * k;
        int noOfFlowersAvaliable = bloomDay.length;
        if (noOfFlowerRequired > noOfFlowersAvaliable) {
            return -1;
        }
        int low = 0, high = 0;
        for (int i = 0; i < noOfFlowersAvaliable; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low <= high) {
            int flowerCount = 0, mid = low + (high - low) / 2;
            for (int i = 0; i < noOfFlowersAvaliable; i++) {
                if (bloomDay[i] <= mid) {
                    flowerCount++;
                }
            }
            if (flowerCount >= noOfFlowerRequired) {
                if (isBouquteFormed(bloomDay, mid, m, k)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isBouquteFormed(int a[], int mid, int m, int k) {
        int ans = 0, c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= mid) {
                c++;
                if (c == k) {
                    c = 0;
                    ans++;
                }
            } else {
                c = 0;
            }
        }
        return ans >= m ? true : false;
    }
}