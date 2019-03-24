package com.leetcode;

import java.util.*;

/**
 * Solution for MinimumWindowSubstring problem.
 * https://leetcode.com/problems/minimum-window-substring/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character ch : t.toCharArray()) {
            int count = tMap.getOrDefault(ch, 0);
            tMap.put(ch, count + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int chInWindow = 0;
        int minLen = s.length() + 1;
        int left = 0, right = 0;
        int minLeft = 0, minRight = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (tMap.containsKey(ch)) {
                int count = windowMap.getOrDefault(ch, 0);
                windowMap.put(ch, count + 1);
                if (tMap.get(ch) >= count + 1)
                    chInWindow++;
            }

            while (chInWindow == t.length()) {
                if (minLen > right - left) {
                    minLen = right - left;
                    minLeft = left;
                    minRight = right;
                }

                ch = s.charAt(left);
                if (tMap.containsKey(ch)) {
                    int count = windowMap.getOrDefault(ch, 0);
                    windowMap.put(ch, count - 1);
                    if (tMap.get(ch) > count - 1)
                        chInWindow--;
                }

                left++;
            }
            right++;
        }

        if (minLen > s.length())
            return "";

        return s.substring(minLeft, minRight + 1);
    }

}
