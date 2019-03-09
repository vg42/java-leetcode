package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for LongestSubstringWithoutRepeatingCharacters problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @Before
    public void setup() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void leetcodeExample() throws Exception {
        String s = "abcabcbb";

        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void emptyString() throws Exception {
        String s = "";

        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void additionalCase() throws Exception {
        String s = "1234444124351asfv";

        assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

}