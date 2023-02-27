package com.types.arrays;

public class SearchRange {

    public int search(int[] nums, int target, boolean isLeft) {
        int l = 0;
        int r = nums.length-1;
        int i  = -1;

        while (l <= r) {
            int m= (l+r)/2;
            if (nums[m] < target)
                l= m+1;
            else if (nums[m] > target)
                r = m-1;
            else {
                i = m;
                if (isLeft)
                    r = m-1;
                else
                    l = m+1;
            }
        }
        return i;
    }

    public int[] searchRange(int[] nums, int target) {
        int start= search(nums, target, true);
        int end= search(nums, target, false);


        return new int[]{start,end};
    }

    public static void main(String[] args) {
        System.out.println(new SearchRange().searchRange(new int []{5,7,7,8,8,10}, 8));
    }
}
