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
        int ans = 0, i = 0;
        while (i <= a.length - k) {
            int adjCount = 0;
            for (int j = i; j < i + k; j++) {
                if (a[j] <= mid) {
                    adjCount++;
                } else {
                    break;
                }
            }
            if (adjCount >= k) {
                ans++;
                if (ans >= m) {
                    return true;
                }
                i = i + k;
            } else {
                i++;
            }
        }
        return false;
    }
}