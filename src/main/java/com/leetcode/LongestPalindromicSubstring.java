package com.leetcode;

/**
 * Solution for LongestPalindromicSubstring problem.
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int lenOddPalindrom = findPalindromLen(s, i, i);
            int lenEvenPalindrom = findPalindromLen(s, i, i + 1);
            int len = Math.max(lenOddPalindrom, lenEvenPalindrom);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int findPalindromLen(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i -= 1;
            j += 1;
        }

        return j - i - 1;
    }

}
