class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
            } else {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                    ans += s.charAt(i);
                } else {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        ans += s.charAt(i);
                    }
                }
            }
        }
        return ans;
    }
}