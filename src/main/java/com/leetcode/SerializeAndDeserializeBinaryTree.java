package com.leetcode;

import java.util.*;

/**
 * Solution for SerializeAndDeserializeBinaryTree problem.
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class SerializeAndDeserializeBinaryTree {

    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        rserialize(root, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new LinkedList(Arrays.asList(data.split(" ")));

        return rdeserialize(list);
    }

    private void rserialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null ");
        }
        else {
            sb.append(Integer.toString(root.val) + " ");
            rserialize(root.left, sb);
            rserialize(root.right, sb);
        }
    }

    private TreeNode rdeserialize(List<String> list) {
        if (list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        root.left = rdeserialize(list);
        root.right = rdeserialize(list);

        return root;
    }

}
