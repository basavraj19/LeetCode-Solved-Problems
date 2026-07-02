class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int i = 1, j = max, mid = 0;
        while (i <= j) {
            int count = 0;
            mid = (i + j) / 2;
            for (int k = 0; k < piles.length; k++) {
                count += Math.ceil((double) piles[k] / mid);
            }
            if (count <= h) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}