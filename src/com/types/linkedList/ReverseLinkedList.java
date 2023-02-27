package com.types.linkedList;

public class ReverseLinkedList {

    static ListNode result = null;

    public static void reverse(ListNode node) { //2 ,N
        ListNode next = node.next; //3, N
        if (next == null) {
            result = new ListNode(node.val, null);
            return;
        }
        reverse(next);
        result = new ListNode(next.val, null);

    }


    public static void main(String[] args) {
       ListNode node = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));
       reverse(node);
       System.out.println(result);
    }
}
