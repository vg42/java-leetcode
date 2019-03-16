package com.leetcode;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for SameTree problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class SameTreeTest {

    private SameTree sameTree;

    @Before
    public void setup() {
        sameTree = new SameTree();
    }

    private SameTree.TreeNode listToTree(List<Integer> nums, int i) {
        if (nums == null) {
            return null;
        }

        SameTree.TreeNode root = null;
        if (i < nums.size()) {
            if (nums.get(i) == null) {
                return root;
            }
            root = new SameTree.TreeNode(nums.get(i));
            root.left = listToTree(nums, 2 * i + 1);
            root.right = listToTree(nums, 2 * i + 2);
        }

        return root;
    }

    private List<Integer> treeToList(SameTree.TreeNode tree) {
        List<Integer> result = new ArrayList<Integer>();

        if (tree == null) {
            return result;
        }

        result.add(tree.val);
        result.addAll(treeToList(tree.left));
        result.addAll(treeToList(tree.right));

        return result;
    }

    @Test
    public void leetcodeExample1() throws Exception {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);

        SameTree.TreeNode treeNums = listToTree(nums, 0);
        SameTree.TreeNode treeExpected = listToTree(expected, 0);

        assertTrue(sameTree.isSameTree(treeNums, treeExpected));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        List<Integer> nums = Arrays.asList(1, 2);
        List<Integer> expected = Arrays.asList(1, null, 2);

        SameTree.TreeNode treeNums = listToTree(nums, 0);
        SameTree.TreeNode treeExpected = listToTree(expected, 0);

        assertFalse(sameTree.isSameTree(treeNums, treeExpected));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        List<Integer> nums = Arrays.asList(1, 2, 1);
        List<Integer> expected = Arrays.asList(1, 1, 2);

        SameTree.TreeNode treeNums = listToTree(nums, 0);
        SameTree.TreeNode treeExpected = listToTree(expected, 0);

        assertFalse(sameTree.isSameTree(treeNums, treeExpected));
    }

}