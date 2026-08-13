class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            map.put(arr[i], 1);
        }

        for (int i = 1; i <= max; i++) {
            if (!map.containsKey(i)) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }

        return max + k;
    }
}