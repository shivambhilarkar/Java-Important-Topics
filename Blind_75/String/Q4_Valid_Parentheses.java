package Blind_75.String;

import java.util.Stack;

public class Q4_Valid_Parentheses {

    class Solution {

        private boolean checkIsValid(String str) {
            if (str == null) return true;

            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) {
                switch (ch) {
                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') return false;
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop() != '{') return false;
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') return false;
                        break;
                    default:
                        stack.push(ch);
                }
            }
            return stack.isEmpty();
        }

        public boolean isValid(String s) {
            return checkIsValid(s);
        }
    }
}
