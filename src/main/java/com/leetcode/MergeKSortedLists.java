package com.leetcode;

import java.util.*;

/**
 * Solution for MergeKSortedLists problem.
 * https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/23/19
 */
public class MergeKSortedLists {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length,
                new Comparator<ListNode>() {
                    public int compare(ListNode a, ListNode b) {
                        return a.val - b.val;
                    }
                });

        ListNode head = new ListNode(0);
        ListNode current = head;

        for (ListNode list : lists)
            if (list != null)
                pq.add(list);

        while (!pq.isEmpty()) {
            current.next = pq.poll();
            current = current.next;

            if (current.next != null)
                pq.add(current.next);
        }

        return head.next;
    }

}
