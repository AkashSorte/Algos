package com.types.arrays;

public class ContainerWater {
    public int maxArea(int[] height) {
//        int maxArea = 0;
//        for (int i=0; i < height.length/2; i++) {
//            for (int j=height.length-1;height.length/2 <= j; j--) {
//                int area = (height[i] > height[j] ? height[j] : height[i]) * (j - i);
//                if (maxArea < area) {
//                    maxArea = area;
//                }
//            }
//        }
//        return maxArea;

        int i = 0, j = height.length - 1, max = 0;

        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new ContainerWater().maxArea(new int[]{2,3,4,5,18,17,6}));
    }
}
