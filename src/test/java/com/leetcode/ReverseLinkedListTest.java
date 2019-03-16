package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for ReverseLinkedList problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/16/19
 */
public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    @Before
    public void setup() {
        reverseLinkedList = new ReverseLinkedList();
    }

    private ReverseLinkedList.ListNode arrayToLinkedList(int[] nums) {
        if (nums == null) {
            return null;
        }

        ReverseLinkedList.ListNode head, current;
        head = new ReverseLinkedList.ListNode(0);
        current = head;
        for (int i = 0; i < nums.length; i++) {
            current.next = new ReverseLinkedList.ListNode(nums[i]);
            current = current.next;
        }

        return head.next;
    }

    private int[] linkedListToArray(ReverseLinkedList.ListNode head) {
        if (head == null) {
            return null;
        }

        int len = 1;
        ReverseLinkedList.ListNode current = head;
        while (current.next != null) {
            len++;
            current = current.next;
        }

        int[] nums = new int[len];

        current = head;
        for (int i = 0; i < len; i++) {
            nums[i] = current.val;
            current = current.next;
        }

        return nums;
    }

    @Test
    public void leetcodeExample() throws Exception {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        ReverseLinkedList.ListNode list = arrayToLinkedList(nums);
        ReverseLinkedList.ListNode resultList = reverseLinkedList.reverseList(list);
        int[] result = linkedListToArray(resultList);

        assertArrayEquals(expected, result);
    }

    @Test
    public void leetcodeExampleRecursion() throws Exception {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        ReverseLinkedList.ListNode list = arrayToLinkedList(nums);
        ReverseLinkedList.ListNode resultList = reverseLinkedList.reverseListRecursion(list);
        int[] result = linkedListToArray(resultList);

        assertArrayEquals(expected, result);
    }

    @Test
    public void additionalExample() throws Exception {
        int[] nums = {1, 2, 3, 0};
        int[] expected = {0, 3, 2, 1};

        ReverseLinkedList.ListNode list = arrayToLinkedList(nums);
        ReverseLinkedList.ListNode resultList = reverseLinkedList.reverseList(list);
        int[] result = linkedListToArray(resultList);

        assertArrayEquals(expected, result);
    }

    @Test
    public void additionalExampleRecursion() throws Exception {
        int[] nums = {1, 2, 3, 0};
        int[] expected = {0, 3, 2, 1};

        ReverseLinkedList.ListNode list = arrayToLinkedList(nums);
        ReverseLinkedList.ListNode resultList = reverseLinkedList.reverseListRecursion(list);
        int[] result = linkedListToArray(resultList);

        assertArrayEquals(expected, result);
    }

}