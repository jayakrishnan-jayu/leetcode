// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() < 2) return false;
        Stack<Character> stack = new Stack<>();

        char c;
        for (int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') 
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}