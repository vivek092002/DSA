package com.DSA.arrays.gfg;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-1,2};
        System.out.println(maxSum(arr));
    }


    //Naive Approach O(n^2) complexity
    static int maxSum(int[] arr){
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr = curr + arr[j];
                res = Math.max(curr, res);
            }
        }

        return res;
    }
}
