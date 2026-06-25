class Solution {
    public void nextPermutation(int[] temp) {
        int c = 0;
        for (int i = temp.length - 1; i > 0; i--) {
            if (temp[i] > temp[i - 1]) {
                int ind = findImmediateGreater(temp, i-1);
                int t = temp[i-1];
                temp[i-1] = temp[ind];
                temp[ind] = t;
                reverse(temp, i, temp.length - 1);
                c++;
                break;
            }
        }

        if (c == 0) {
            reverse(temp, 0, temp.length - 1);
        }
    }

    public int findImmediateGreater(int temp[], int ind) {
        int ans = -1;
        for (int i = ind; i < temp.length; i++) {
            if (temp[i] > temp[ind]) {
                ans = i;
            }
        }
        return ans;
    }

    public void reverse(int temp[], int start, int end) {
        while (start <= end) {
            int t = temp[start];
            temp[start] = temp[end];
            temp[end] = t;
            start++;
            end--;
        }
    }
}