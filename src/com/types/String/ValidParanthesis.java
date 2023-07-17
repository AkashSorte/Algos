package com.types.String;

import java.util.Arrays;
import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        if (s == null || s.equals(""))
            return false;

        if (s.length()%2 != 0)
            return false;


        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Arrays.asList('(', '[', '{').contains(c)) {
                stack.add(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else
                stack.add(c);
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParanthesis().isValid("([}}])"));
    }
}
