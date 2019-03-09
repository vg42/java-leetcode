package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for LongestSubstringWithoutRepeatingCharacters problem.
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int left = 0, right = 0; right < stringLength; right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
