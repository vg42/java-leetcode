package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for AddTwoNumbers problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @Before
    public void setup() {
        addTwoNumbers = new AddTwoNumbers();
    }

    private AddTwoNumbers.ListNode intToListNode(int num) {
        // Should be not negative.
        if (num < 0) {
            return null;
        }

        AddTwoNumbers.ListNode startDigit = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode currentDigit= startDigit;

        if (num == 0) {
            return startDigit;
        }

        while (num != 0) {
            currentDigit.next = new AddTwoNumbers.ListNode(num % 10);
            currentDigit = currentDigit.next;
            num /= 10;
        }

        return startDigit.next;
    }

    private int listNodeToInt(AddTwoNumbers.ListNode l) {
        if (l == null) {
            return 0;
        }

        int num = 0;
        int power10 = 1;

        while (l != null) {
            num += l.val * power10;
            l = l.next;
            power10 *= 10;
        }

        return num;
    }

    @Test
    public void leetcodeExample() throws Exception {
        AddTwoNumbers.ListNode l1 = intToListNode(342);
        AddTwoNumbers.ListNode l2 = intToListNode(465);

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(807, listNodeToInt(result));
    }

    @Test
    public void oneNumberZero() throws Exception {
        AddTwoNumbers.ListNode l1 = intToListNode(0);
        AddTwoNumbers.ListNode l2 = intToListNode(123);

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(123, listNodeToInt(result));

        result = addTwoNumbers.addTwoNumbers(l2, l1);
        assertEquals(123, listNodeToInt(result));
    }

    @Test
    public void carryDigit() throws Exception {
        AddTwoNumbers.ListNode l1 = intToListNode(99);
        AddTwoNumbers.ListNode l2 = intToListNode(34);

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(133, listNodeToInt(result));
    }

}