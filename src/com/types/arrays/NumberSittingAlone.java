package com.types.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NumberSittingAlone {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(new Integer[]{1,1,2,2,6,3,3, 7,4,4});
        Stack<Integer> integers = new Stack<>();

        for (Integer i : input){
            if(integers.size() > 0 && integers.peek().equals(i)) {
                integers.pop();
            } else {
                integers.push(i);
            }
        }
        System.out.println(integers);

    }
}
