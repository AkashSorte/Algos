package com.types.arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int prefix = 1;
        for (int i=0; i< nums.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i=nums.length-1; i>=0; i--) {
            ans[i] = postfix * ans[i];
            postfix *= nums[i];
        }


        return ans;
    }

    public static void main(String[] args) {
        System.out.println( new ProductExceptSelf().productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
}
