package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for MergeTwoSortedLists problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @Before
    public void setup() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    private MergeTwoSortedLists.ListNode arrayToList(int[] nums) {
        if (nums == null) {
            return null;
        }

        MergeTwoSortedLists.ListNode head, current;
        head = new MergeTwoSortedLists.ListNode(0);
        current = head;
        for (int i = 0; i < nums.length; i++) {
            current.next = new MergeTwoSortedLists.ListNode(nums[i]);
            current = current.next;
        }

        return head.next;
    }

    private int[] listToArray(MergeTwoSortedLists.ListNode head) {
        if (head == null) {
            return null;
        }

        int len = 1;
        MergeTwoSortedLists.ListNode current = head;
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
        int[] l1ar = {1,2,4};
        int[] l2ar = {1,3,4};
        int[] expected = {1,1,2,3,4,4};

        MergeTwoSortedLists.ListNode l1 = arrayToList(l1ar);
        MergeTwoSortedLists.ListNode l2 = arrayToList(l2ar);
        int[] result = listToArray(mergeTwoSortedLists.mergeTwoLists(l1, l2));

        assertArrayEquals(expected, result);
    }

}