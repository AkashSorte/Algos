package com.types.String;

import java.util.*;

// abcd+*- =>  a-(b*(c+d))
public class PostFixToInfix {

    public static void main(String[] args) {
        String input = "xyztuv/*-+*";

        String infix = convertToInfix(input);
        System.out.println(infix);
    }

    private static String convertToInfix(String input) {
        if (input == null || input.equals(""))
            return null;

        Set<Character> operators = new HashSet<>(Arrays.asList('+', '-','*', '/'));

        Stack<Character> letters = new Stack<>();
        List<Character> operatorList = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (operators.contains(c))
                operatorList.add(c);
            else
                letters.add(c);

        }

        String infix =String.valueOf(letters.pop());

        for (char op :  operatorList) {
            if (letters.size() > 1)
                infix = "(" + letters.pop() + op + infix + ")";
            else
                infix =  String.valueOf(letters.pop()) + op + infix + "";
        }
        return infix;
    }
}
