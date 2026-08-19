class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(
                Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000));

        int nums = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int temp1 = map.get(s.charAt(i));
            int temp2 = map.get(s.charAt(i + 1));

            if (temp1 >= temp2) {
                nums += temp1;
            } else {
                nums -= temp1;
            }
        }
        return nums;
    }
}