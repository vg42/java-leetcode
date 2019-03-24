package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for SerializeAndDeserializeBinaryTree problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class SerializeAndDeserializeBinaryTreeTest {

    private SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree;

    @Before
    public void setup() {
        serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        SerializeAndDeserializeBinaryTree.TreeNode root = new SerializeAndDeserializeBinaryTree.TreeNode(1);
        root.left = new SerializeAndDeserializeBinaryTree.TreeNode(2);
        root.right = new SerializeAndDeserializeBinaryTree.TreeNode(3);
        root.right.left = new SerializeAndDeserializeBinaryTree.TreeNode(4);
        root.right.right = new SerializeAndDeserializeBinaryTree.TreeNode(5);
        String expected = "1 2 null null 3 4 null null 5 null null ";

        assertEquals(expected, serializeAndDeserializeBinaryTree.serialize(root));
    }

    @Test
    public void additionalExample1() throws Exception {
        String s = "20 8 -4 null null 12 10 null null 14 null null 22 null null ";
        SerializeAndDeserializeBinaryTree.TreeNode root = serializeAndDeserializeBinaryTree.deserialize(s);

        assertEquals(s, serializeAndDeserializeBinaryTree.serialize(root));
    }

}