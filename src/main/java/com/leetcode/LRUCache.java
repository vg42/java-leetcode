package com.leetcode;

import java.util.*;

/**
 * Solution for LRUCache problem.
 * https://leetcode.com/problems/lru-cache/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class LRUCache {

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
    }

    private int capacity;
    private int size;
    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private DLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);

        if (node == null) {
            return -1;
        }

        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);

        if (node == null) {
            size++;
            if (size > capacity) {
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                size--;
            }

            node = new DLinkedNode();
            node.key = key;
            node.value = value;
            addNode(node);
            cache.put(key, node);
        }
        else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addNode(DLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;
    }

    private DLinkedNode popTail() {
        DLinkedNode prev = tail.prev;
        tail.prev = prev.prev;
        prev.prev.next = tail;

        return prev;
    }

    private void moveToHead(DLinkedNode node) {
        // Remove node.
        node.next.prev = node.prev;
        node.prev.next = node.next;

        // Add in the beginning.
        node.prev = head;
        node.next = head.next;
        head.next = node;
        node.next.prev = node;
    }

}
