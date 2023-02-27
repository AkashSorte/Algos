package com.types.arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int curr =0;

        for (int i=0; i < nums.length; i++) {

            if (curr < 0) {
                curr=0;
            }
            curr+=nums[i];
            max = Math.max(max,curr);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
