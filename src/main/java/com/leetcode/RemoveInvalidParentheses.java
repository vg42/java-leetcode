package com.leetcode;

import java.util.*;

/**
 * Solution for RemoveInvalidParentheses problem.
 * https://leetcode.com/problems/remove-invalid-parentheses/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/20/19
 */
public class RemoveInvalidParentheses {

    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        char[] p = {'(', ')'};
        backtracking(s, 0, 0, p, result);

        return result;
    }

    private void backtracking(String s, int current, int lastRemoved, char[] p, List<String> result) {
        int opened = 0;
        for (int i = current; i < s.length(); i++) {
            if (s.charAt(i) == p[0]) opened++;
            if (s.charAt(i) == p[1]) opened--;
            if (opened < 0) {
                for (int j = lastRemoved; j <= i; j++) {
                    if (s.charAt(j) == p[1] && (j == 0 || s.charAt(j - 1) != p[1])) {
                        backtracking(s.substring(0, j) + s.substring(j + 1, s.length()), i, j, p, result);
                    }
                }
                return;
            }
        }

        String reversed = new StringBuilder(s).reverse().toString();
        if (p[0] == '(') {
            char[] reversedP = {')', '('};
            backtracking(reversed, 0, 0, reversedP, result);
        }
        else {
            result.add(reversed);
        }
    }

}
