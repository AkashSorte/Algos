package com.types.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Todo: Need to solve This
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> sums = new ArrayList<>();
        int ans = 0;
        Arrays.sort(nums);
        if (nums.length < 3)
            return 0;

        int firstSum = nums[0] + nums[1] + nums[nums.length-1];
        ans = Math.abs(target - firstSum);

        for (int i=0; i<nums.length-2; i++) {

            if (i>0 && nums[i] == nums[i-1]) {
                i++;
            }

            int j=i+1, k=nums.length-1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);

                if (diff < ans) {
                    ans = diff;
                    j++;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                } else if (diff >= ans) {
                    k--;
                }


            }


        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
}
