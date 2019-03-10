package com.leetcode;

/**
 * Solution for ZigZagConversion problem.
 * https://leetcode.com/problems/zigzag-conversion/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/10/19
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int current = i;
            while (current < s.length()) {
                result.append(s.charAt(current));
                if (i > 0 && i < numRows - 1) {
                    int middle = current + 2 * (numRows - 1 - i);
                    if (middle < s.length()) {
                        result.append(s.charAt(middle));
                    }
                }
                current += numRows > 1 ? 2 * (numRows - 1) : 1;
            }
        }

        return result.toString();
    }

}
