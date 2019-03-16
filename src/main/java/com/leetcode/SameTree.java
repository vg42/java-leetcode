package com.leetcode;

/**
 * Solution for SameTree problem.
 * https://leetcode.com/problems/same-tree/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class SameTree {

    /**
     * Definition for a binary tree node.
     */
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode(int x) { val = x; }
     }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == null && q == null;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
