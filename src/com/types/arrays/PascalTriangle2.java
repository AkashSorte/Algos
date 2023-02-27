package com.types.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex==0) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            return ans;
        }
        int[] arr = new int[rowIndex];
        int n =0;
        for (int i=1; i<= rowIndex; i++) {

            for (int j=0; j<i; j++) {
                if (j == 0 || j == i-1) {
                    arr[j]=1;
                    n = 1;
                } else {

                    int sum  = n + arr[j];
                    n = arr[j];
                    arr[j] = sum;
                }

            }

        }
        return IntStream.of(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        System.out.println(new PascalTriangle2().getRow(3));
    }
}
