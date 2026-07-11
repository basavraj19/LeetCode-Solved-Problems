class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysRequired = noOfDaysRequired(weights, mid);
            if (daysRequired <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int noOfDaysRequired(int weights[], int val) {
        int ans = 1, capacity = 0;
        for (int i = 0; i < weights.length; i++) {
            if (capacity + weights[i] > val) {
                capacity = weights[i];
                ans++;
            } else {
                capacity += weights[i];
            }
        }
        return ans;
    }
}