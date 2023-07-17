package com.types.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int longest = 1;

        Arrays.sort(nums);

        int temp =1;
        int pointer = nums[0];

        for (int i : nums) {
            if (pointer+1 == i) {
                temp++;
                if (longest < temp)
                    longest = temp;
            } else
                temp = 1;

            pointer = i;
        }


//        for (int i=0; i<nums.length-1; i++) {
//           if (nums[i] + 1 == nums[i+1]) {
//               temp++;
//               if (longest < temp)
//                   longest = temp;
//           } else
//               temp=1;
//
//        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(new int[]{1,2,0,1}));
    }
}
