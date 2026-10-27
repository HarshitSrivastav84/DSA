import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.isValid("()"));      // true
        System.out.println(obj.isValid("()[]{}"));  // true
        System.out.println(obj.isValid("(]"));      // false
        System.out.println(obj.isValid("([)]"));    // false
        System.out.println(obj.isValid("("));       // false
    }
}