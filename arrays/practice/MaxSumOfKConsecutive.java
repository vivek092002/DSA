package com.DSA.arrays.practice;

public class MaxSumOfKConsecutive {
    public static void main(String[] args) {
        int[] arr = {10,5,-2,20,1};
        int k = 3;
        System.out.println(maxSum(arr,k));
        System.out.println(max(arr,k));
    }

    static int maxSum(int[] arr, int k){
        int res = 0;
        for (int i = 0; i+k-1 < arr.length; i++) {
            int curr = 0;
            for (int j = 0; j < k; j++) {
                curr += arr[j+i];
            }
            res = Math.max(res,curr);
        }

        return res;
    }

    //sliding window technique
    public static int max(int[] arr, int k){
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[k];
        }
        int result = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr +  arr[i] - arr[i-k];
            result = Math.max(result,curr);
        }
        return result;
    }
}
