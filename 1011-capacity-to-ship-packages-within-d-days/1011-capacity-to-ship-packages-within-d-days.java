class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possibleToShip(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean possibleToShip(int weights[], int days, int val) {
        int ans = 0, capacity = 0;
        for (int i = 0; i < weights.length; i++) {
            capacity += weights[i];

            if (capacity > val) {
                capacity = weights[i];
                ans++;
            }
        }

        ans++;
        if (ans <= days) {
            return true;
        }
        return false;
    }
}