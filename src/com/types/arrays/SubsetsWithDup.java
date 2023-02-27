package com.types.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<String, List<Integer>> hmap = new HashMap<>();
        hmap.putIfAbsent("", new ArrayList<>());
        if (nums.length == 0) {
            return new ArrayList<>(hmap.values());
        }

        for (int i=0; i< nums.length; i++) {

            String key = "";
            List<Integer> temp = new ArrayList<>();



            for (int j=i; j<nums.length; j++) {
                temp.add(nums[j]);
                key += String.valueOf(nums[j]);
            }

            hmap.putIfAbsent(key, temp);

        }

        return new ArrayList<>(hmap.values());
    }

    public static void main(String[] args) {
        System.out.println(new SubsetsWithDup().subsetsWithDup(new int[]{1,2,2}));
    }
}
