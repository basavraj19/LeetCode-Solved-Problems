class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        int a[][] = new int[123][2];

        for (int i = 0; i < s.length(); i++) {
            int asciiCode = (int) s.charAt(i);
            a[asciiCode][0] = asciiCode;
            a[asciiCode][1]++;
        }

        Arrays.sort(a, (p, q) -> Integer.compare(q[1], p[1]));

        for (int i = 0; i < 123; i++) {
            if (a[i][1] == 0) {
                break;
            }
            for (int j = 0; j < a[i][1]; j++) {
                ans.append((char) a[i][0]);
            }
        }

        return ans.toString();
    }
}