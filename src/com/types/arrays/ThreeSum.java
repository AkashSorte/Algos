package com.types.arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();

        if (nums.length < 3) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; i++) {


            if (i>0 && nums[i] == nums[i-1])
                continue;

            int j=i+1, k=nums.length-1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if(sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
                else {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    while(j < k && nums[j] == nums[j-1]) {
                       j++;
                    }
                }

            }


        }


        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}