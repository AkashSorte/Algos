package com.types.String;


import java.util.Arrays;
import java.util.Stack;

/**
 * 1 <= s.length <= 3 * 105
 * s consists of digits, '+', '-', '(', ')', and ' '.
 * s represents a valid expression.
 * '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
 * '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
 * There will be no two consecutive operators in the input.
 * Every number and running calculation will fit in a signed 32-bit integer.
 */
public class BasicCalculator {

    public static void main(String[] args) {
//        String input = "(1+(4+5+2)-3)+(6+8)";
//        int result = calc(input);
//        System.out.println(result);
        Stack<Character> stack = new Stack<>();
        System.out.println(stack.isEmpty() ? "empty":stack.peek());
    }

    private static Integer calc(String input) {
        if (input == null || input.equals(""))
            return null;

        int i = 0;

        return calculate(input, i);
    }

    private static int calculate(String in, int i) {
        int sum = 0;
        char operator='+';
        int j = i;
        while (j <= in.length()-1) {
            if ('(' == in.charAt(j)) {
                j++;
                sum = sum + calculate(in.substring(j, in.length()), i);
                i=j;
            } else if (Arrays.asList('+', '-').contains(in.charAt(j))) {
                operator = in.charAt(j);
                j++;
                continue;
            } else if (')' == in.charAt(j)) {
                break;
            } else {
                sum = operator == '+' ?  sum + Character.getNumericValue(in.charAt(j)) : sum - Character.getNumericValue(in.charAt(j));
            }

            j++;
        }
        return sum;
    }
}
