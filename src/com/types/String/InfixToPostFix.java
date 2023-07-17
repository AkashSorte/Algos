package com.types.String;

import java.util.Arrays;

public class InfixToPostFix {

    public static void main(String[] args) {
        String input = "x*(y+(z-(t*(u/v))))";

        String infix = convertInfixToPostFix(input);
        System.out.println(infix);
    }

    private static String convertInfixToPostFix(String input) {
        if (input == null || input.equals(""))
            return null;

        String operators ="";
        String letters = "";

        char[] inputArr = input.toCharArray();

        for (int i= input.length()-1; i >=0; i--) {

            if (inputArr[i]==')' || inputArr[i]=='(')
                continue;
            else if (Arrays.asList('*', '-', '+', '/').contains(inputArr[i]))
                operators = operators + inputArr[i];
            else
                letters = inputArr[i] + letters;
        }


        return letters + operators;
    }
}
