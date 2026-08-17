class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Character, Integer> sorted = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new));

        for (Map.Entry<Character, Integer> item : sorted.entrySet()) {
            ans.append(solve(item.getKey(), item.getValue()));
        }
        return ans.toString();
    }

    public StringBuilder solve(Character ch, int n) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            ans.append(ch);
        }

        return ans;
    }
}