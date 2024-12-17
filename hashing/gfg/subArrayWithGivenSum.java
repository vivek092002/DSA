package com.DSA.hashing.gfg;

import java.util.HashSet;

public class subArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        int n = arr.length;
        int sum = 22;

        System.out.println(isSubArray(arr,n,sum));
        System.out.println(isSum(arr,sum));
    }

    //Naive Method O(N^2)
    public static boolean isSubArray(int[] arr, int n, int sum){
        for (int i = 0; i < n; i++) {
            int curr_sum = 0;
            for (int j = i; j < n; j++) {
                curr_sum += arr[j];
                if (curr_sum ==  sum){
                    return true;
                }
            }
        }
        return false;
    }

    //Efficient Solution O(N)
    public static boolean isSum(int[] arr, int sum){
        HashSet<Integer> h = new HashSet<Integer>();
        int pre_sum = 0;
        for (int x : arr){
            pre_sum += x;
            if (pre_sum == sum){
                return true;
            }
            if (h.contains(pre_sum-sum)){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
}
