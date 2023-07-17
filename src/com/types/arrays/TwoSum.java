package com.types.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums ==  null || nums.length == 0)
            return null;

        List<Integer> result = new ArrayList<>();

        for (int i=0; i<nums.length-1; i++) {

            for ( int j=i+1; j<=nums.length-1; j++) {
                if (target == nums[i]+nums[j]) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[]{3,3}, 6));
    }

}
