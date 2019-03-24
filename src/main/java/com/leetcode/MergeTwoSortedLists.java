package com.leetcode;

/**
 * Solution for MergeTwoSortedLists problem.
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class MergeTwoSortedLists {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }

        current.next = l1 == null ? l2 : l1;

        return head.next;
    }

}
