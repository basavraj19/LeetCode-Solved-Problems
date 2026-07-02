class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        int low = 1;
        while (low <= high) {
            int hours = 0;
            int mid = (low + high) / 2;
            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceil((double)piles[i] / mid);
            }
            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
