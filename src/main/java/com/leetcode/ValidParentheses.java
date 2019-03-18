package com.leetcode;

import java.util.*;

/**
 * Solution for ValidParentheses problem.
 * https://leetcode.com/problems/valid-parentheses/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/18/19
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char prevCh = stack.pop();
            if (map.get(prevCh) != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
