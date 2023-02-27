package com.types.arrays;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        if (prices.length < 2)
            return 0;

        if (prices.length == 2 && prices[1] > prices[0]) {
            return prices[1] - prices[0];
        }

        int profit = 0;
        int l=0, r=1;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int diff = prices[r] - prices[l];
                profit = Math.max(profit, diff);
            } else {
                l=r;
            }

            r++;
        }


//        for (int i=0; i<prices.length; i++) {
//
//            int j=i+1;
//
//            while (j < prices.length) {
//                if (prices[i] > prices[j]) {
//                    break;
//                } else {
//                    int diff = prices[j] - prices[i];
//                    if (diff > profit)
//                        profit = diff;
//                    j++;
//                }
//            }
//
//        }

        return profit;


    }

    public static void main(String[] args) {
        int profit =new MaxProfit().maxProfit(new int[]{7,6,4,3,1});

        System.out.println(profit);
    }
}
