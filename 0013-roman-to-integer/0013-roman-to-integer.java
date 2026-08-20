class Solution {
    Map<Character, Integer> map = new HashMap<>(
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000));

    public int romanToInt(String s) {
        int ans = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int val = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i + 1));
            if (nextVal > val) {
                ans -= val;
            } else {
                ans += val;
            }
        }

        return ans;
    }
}