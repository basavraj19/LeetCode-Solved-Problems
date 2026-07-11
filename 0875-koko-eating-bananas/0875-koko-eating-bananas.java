class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 0, j = 0;
        for (i = 0; i < piles.length; i++) {
            j = Math.max(j, piles[i]);
        }
        i = 1;
        while (i <= j) {
            int mid = (i + j) / 2, count = 0;
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