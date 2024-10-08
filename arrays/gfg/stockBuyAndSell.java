package com.DSA.arrays.gfg;

public class stockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,12};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] price){
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i-1]){
                profit += (price[i] - price[i-1]);
            }
        }
        return profit;
    }
}
