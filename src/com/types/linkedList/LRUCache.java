package com.types.linkedList;


public class LRUCache {

    private int capacity;
    private ListNode head = null;
    private ListNode last = null;



    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        ListNode node = head;
        Integer value = null;
        while (node != null) {
            if (node.key.equals(key)) {
                value = node.value;
                moveToTop(node);
                break;
            }
            node = node.next;
        }
        return value;
    }

    public void put(int key, int value) {
        ListNode node = head;
        boolean updateFlag = false;
        int numOfNodes = 0;
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                moveToTop(node);
                updateFlag = true;
                break;
            }
            node = node.next;
            numOfNodes++;
        }
        if (!updateFlag) {

            ListNode listNode = new ListNode(null, head, key, value);
            head = listNode;

            if (numOfNodes > capacity) {
                ListNode previous = last.prev;
                previous.next = null;
                last = previous;
            }

        }


    }

    void moveToTop(ListNode node) {
        ListNode prevNode = node.prev;
        if (prevNode != null) {
            ListNode next = node.next;
            prevNode.next = next;
            next.prev = prevNode;
        }

        node = head.prev;
        head = node;
    }


    class ListNode {
        ListNode prev;
        ListNode next;
        Integer key;
        Integer value;

        public ListNode() { }

        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public ListNode(ListNode prev, ListNode next, int key, int val) {
            this.prev = prev;
            this.next = next;
            this.key = key;
            this.value = val;
        }
    }
}
