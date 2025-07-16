package easy.ej20_validParentheses;

import java.util.Stack;

class Solution {
    static boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static boolean isValid(String s) {
        var st = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (isOpening(c)) {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (!matches(top, c)) return false;
            }
        }

        return st.isEmpty();
    }

    // Input is valid if:
    // 1. Open brackets must be closed by the same type of brackets.
    // 2. Open brackets must be closed in the correct order.
    // 3. Every close bracket has a corresponding open bracket of the same type.
    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]"));   // false
        System.out.println(isValid("([])")); // true
    }
}