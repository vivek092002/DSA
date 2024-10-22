//https://leetcode.com/problems/largest-rectangle-in-histogram/
package com.DSA.stack.leetcode;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int n = arr.length;
        System.out.println(largestArea(arr,n));
    }

    // Naive Solution for O(N^2)
    public static int largestArea(int[] arr, int n){
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j] >= arr[i]){
                    curr += arr[i];
                } else {
                    break;
                }
            }
            for (int j = i+1; j < n ; j++) {
                if (arr[j] >= arr[i]){
                    curr += arr[i];
                } else {
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }

}
