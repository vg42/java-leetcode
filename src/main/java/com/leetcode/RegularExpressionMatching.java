package com.leetcode;

/**
 * Solution for RegularExpressionMatching problem.
 * https://leetcode.com/problems/regular-expression-matching/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/13/19
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        if (p.length() == 1) {
            return s.length() == 1 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
        }

        if (p.charAt(1) != '*') {
            return !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') &&
                    isMatch(s.substring(1), p.substring(1));
        }

        while (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
            if (isMatch(s, p.substring(2))) {
                return true;
            }
            s = s.substring(1);
        }

        return isMatch(s, p.substring(2));
    }

}
