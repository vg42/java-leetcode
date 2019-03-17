package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for LRUCache problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class LRUCacheTest {

    @Test
    public void leetcodeExample() {
        int value;
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);

        value = lRUCache.get(1);
        assertEquals(1, value);

        lRUCache.put(3, 3);
        value = lRUCache.get(2);
        assertEquals(-1, value);

        lRUCache.put(4, 4);
        value = lRUCache.get(1);
        assertEquals(-1, value);

        value = lRUCache.get(3);
        assertEquals(3, value);

        value = lRUCache.get(4);
        assertEquals(4, value);
    }

}