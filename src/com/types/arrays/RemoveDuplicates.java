package com.types.arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int count = 0;
        for(int i=1; i< nums.length; i++) {

            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                nums[i-count]=nums[i];
            }

        }

        return nums.length -count;
    }


    public int removeElement(int[] nums, int val) {
        int count =0;
        for (int i=0; i<nums.length;i++ ){
            if (nums[i] == val) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return count;
    }

    public int removeDuplicatesArrayII(int[] nums) {
        if (nums.length < 3)
            return nums.length;
        int in =2;
        for (int i=2; i<nums.length; i++) {
            if (nums[i] != nums[in-2]) {
                nums[in] = nums[i];
                in++;
            }
        }

        return in;
    }

    public static void main(String[] args) {
      //  new RemoveDuplicates().removeDuplicates(new int[]{1,1,2});
        int count = new RemoveDuplicates().removeDuplicatesArrayII(new int[]{1,1,1,2,2,3});
        System.out.println(count);
    }
}
