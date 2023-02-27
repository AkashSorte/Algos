package com.types.linkedList;

public class AddDigits {

    int carry =0;

    ListNode addDigit(ListNode i, ListNode j, ListNode result) {
        if (i == null || j == null) {
            return result;
        }
        int sum = i.val + j.val;

        result =  new ListNode((sum >= 10 ? sum%10 : sum )+ carry, addDigit(i.next, j.next, result.next));

        carry = sum/10;
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            // if (result)
            result =  result.next;
            ListNode add =  new ListNode((sum >= 10 ? sum%10 : sum )+ carry, null);
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            result = add;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(new AddDigits().addTwoNumbers(listNode1, listNode2));
    }

}
