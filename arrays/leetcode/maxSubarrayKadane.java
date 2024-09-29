//https://leetcode.com/problems/maximum-subarray/description/

package com.DSA.arrays.leetcode;

public class maxSubarrayKadane {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArr(arr));
    }

    //Kadane's Algorithm Very important
    public static int subArr(int[] num){
        int sum = 0;
        int maxi = num[0];
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            maxi = Math.max(maxi,sum);

            if (sum<0){
                sum=0;
            }
        }

        return maxi;
    }
}
