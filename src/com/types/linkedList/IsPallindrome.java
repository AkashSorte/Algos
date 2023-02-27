package com.types.linkedList;

import java.util.Stack;

public class IsPallindrome {
    public boolean isPalindrome(ListNode head) {

        ListNode current = head;
        Stack<Integer> stack = new Stack<>();
        while (current != null) {
            if (stack.size() >0 && stack.peek() == current.val)
                stack.pop();
            else
                stack.push(current.val);


            current = current.next;

        }

        return stack.size() == 0;

    }

    public static void main(String[] args) {
        System.out.println(new IsPallindrome().isPalindrome(new ListNode(1)));
    }

}
