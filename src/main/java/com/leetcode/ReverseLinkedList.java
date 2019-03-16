package com.leetcode;

/**
 * Solution for ReverseLinkedList problem.
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/16/19
 */
public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current, next, prev;

        prev = null;
        current = head;
        while (current!= null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversedTail = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return reversedTail;
    }

}
