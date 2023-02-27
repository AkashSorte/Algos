package com.types.linkedList;

public class AddTwoNumbers {
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 ==null && l2 == null) {
            if (carry > 0)
                return new ListNode(carry);

            return null;
        }

        int l1val = l1 != null ? l1.val : 0;
        int l2val = l2 != null ? l2.val : 0;

        int sum = l1val + l2val + carry;
        int val = sum >= 10 ? sum%10 : sum ;
        carry = sum/10;

        ListNode next = addTwoNumbers(l1 != null ? l1.next : null , l2!=null ? l2.next : null);
        ListNode node = new ListNode(val);

        if (next != null) {
            node.next = next;
        }

        return node;
    }

    public static void main(String[] args) {
        System.out.println(new AddTwoNumbers().addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9))), new ListNode(9, new ListNode(9))));
    }
}
