package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for MoveZeroes problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/16/19
 */
public class MoveZeroesTest {

    private MoveZeroes moveZeroes;

    @Before
    public void setup() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void leetcodeExample() {
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }


    @Test
    public void emptyArray() {
        int[] nums = {};
        int[] expected = {};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }


    @Test
    public void allZeroes() {
        int[] nums = {0,0,0,0,0,0};
        int[] expected = {0,0,0,0,0,0};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }


    @Test
    public void additionalExample() {
        int[] nums = {0,1,0,2,0,0,-1,4,0,9,0,0,0,12};
        int[] expected = {1,2,-1,4,9,12,0,0,0,0,0,0,0,0};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }

}