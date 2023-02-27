package com.types.arrays;

public class FindMinRotatedArray {

    int search(int[] nums){
        int l=0, r= nums.length-1;
        int min=0;
        while (l<r){
            int m =(l+r)/2;
            min = nums[m];
            if (nums[l] < nums[m]) {
                l = m+1;
            } else {
                r = m;
            }
        }

        return min;
    }

    public int findMin(int[] nums) {
        return search(nums);
    }

    public static void main(String[] args) {
        System.out.println(new FindMinRotatedArray().findMin(new int[]{4,5,1,2,3}));
    }
}
