package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Solution for _ problem.
 * Test cases for problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class CapacityToShipPackagesWithinDDaysTest {

    private CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays;

    @Before
    public void setup() {
        capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();
    }

    @Test
    public void testHelpFuncCountShipDays1() throws Exception {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int shipWeight = 10;
        int expected = 7;

        assertEquals(expected, capacityToShipPackagesWithinDDays.countShipDays(weights, shipWeight));
    }

    @Test
    public void testHelpFuncCountShipDays2() throws Exception {
        int[] weights = {5,2,3,4,5,6,3,8,1,10};
        int shipWeight = 12;
        int expected = 5;

        assertEquals(expected, capacityToShipPackagesWithinDDays.countShipDays(weights, shipWeight));
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        int expected = 15;

        assertEquals(expected, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[] weights = {3,2,2,4,1,4};
        int D = 3;
        int expected = 6;

        assertEquals(expected, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        int[] weights = {1,2,3,1,1};
        int D = 4;
        int expected = 3;

        assertEquals(expected, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
    }

}