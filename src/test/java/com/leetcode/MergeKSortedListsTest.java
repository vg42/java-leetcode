package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for MergeKSortedLists problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/23/19
 */
public class MergeKSortedListsTest {

    private MergeKSortedLists mergeKSortedLists;

    @Before
    public void setup() {
        mergeKSortedLists = new MergeKSortedLists();
    }

    private MergeKSortedLists.ListNode arrayToLinkedList(int[] nums) {
        if (nums == null) {
            return null;
        }

        MergeKSortedLists.ListNode head, current;
        head = new MergeKSortedLists.ListNode(0);
        current = head;
        for (int i = 0; i < nums.length; i++) {
            current.next = new MergeKSortedLists.ListNode(nums[i]);
            current = current.next;
        }

        return head.next;
    }

    private int[] linkedListToArray(MergeKSortedLists.ListNode head) {
        if (head == null) {
            return null;
        }

        int len = 1;
        MergeKSortedLists.ListNode current = head;
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
    public void leetcodeExample1() throws Exception {
        int[][] arrayLists = {{1,4,5},{1,3,4},{2,6}};
        int[] expected = {1,1,2,3,4,4,5,6};
        MergeKSortedLists.ListNode[] lists = new MergeKSortedLists.ListNode[arrayLists.length];

        for (int i = 0; i < arrayLists.length; i++)
            lists[i] = arrayToLinkedList(arrayLists[i]);

        MergeKSortedLists.ListNode resultList = mergeKSortedLists.mergeKLists(lists);
        int[] result = linkedListToArray(resultList);

        assertArrayEquals(expected, result);
    }

    @Test
    public void addtionalExample() throws Exception {
        int[][] arrayLists = {{1,4,5,5,9},{1},{-1,-2,0,1,11}};
        int[] expected = {-1,-2,0,1,1,1,4,5,5,9,11};
        MergeKSortedLists.ListNode[] lists = new MergeKSortedLists.ListNode[arrayLists.length];

        for (int i = 0; i < arrayLists.length; i++)
            lists[i] = arrayToLinkedList(arrayLists[i]);

        MergeKSortedLists.ListNode resultList = mergeKSortedLists.mergeKLists(lists);
        int[] result = linkedListToArray(resultList);

        assertArrayEquals(expected, result);
    }

}