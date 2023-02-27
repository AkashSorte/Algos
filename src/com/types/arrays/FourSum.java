package com.types.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        if (nums.length < 4) { return ans;}

        for (int i=0; i<nums.length-3; i++) {

            if (i>0 && nums[i]==nums[i-1])
                continue;

            for (int j=i+1; j<nums.length-2; j++) {

                if (j > i+1 && nums[j]== nums[j-1])
                    continue;

                int k = j+1, l = nums.length-1;

                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        k++;
                        l--;
                        while (nums[k] == nums[k-1] && k<l){
                            k++;
                        }
                        while (nums[l] == nums[l+1] && k<l)
                            l--;
                    }

                }

            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new FourSum().fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
