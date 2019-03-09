package com.leetcode;

/**
 * Solution for AddTwoNumbers problem.
 * https://leetcode.com/problems/add-two-numbers/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class AddTwoNumbers {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currentDigit1, currentDigit2, sum;
        int carry = 0;
        ListNode lHead = new ListNode(0);
        ListNode l = lHead;

        while (l1 != null || l2 != null) {
            currentDigit1 = currentDigit2 = 0;
            if (l1 != null) {
                currentDigit1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentDigit2 = l2.val;
                l2 = l2.next;
            }
            sum = currentDigit1 + currentDigit2 + carry;
            l.next = new ListNode(sum % 10);
            l = l.next;
            carry = sum / 10;
        }

        if (carry != 0) {
            l.next = new ListNode(carry);
        }

        return lHead.next;
    }

}
