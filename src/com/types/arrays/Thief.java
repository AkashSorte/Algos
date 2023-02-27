package com.types.arrays;

import java.util.ArrayList;
import java.util.List;

public class Thief {



    public static void main(String[] args) {
        int[] a= {10,20,30,40,50};// { 102,101,5,7,99,1,2,3};

        int temp =0;

        List<Integer> result = new ArrayList<>();
        int len = a.length;
//        int i =0;
//        while (len != 0) {
//
//
//        }


        for (int i =0;i<a.length;i++) {
            if (temp < a[i]) {
                temp += a[i];
            } else if(temp != 0) {
                result.add(temp);
                temp = 0;
            }
        }
        result.add(temp);
        System.out.print("result : " + result);

    }
}
