
//FInd the maximum value of arr[j]-arr[i] such that j>i;

package com.DSA.arrays.gfg;

public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(diff2(arr));
    }

    //Naive Solution with O(n^2) complexity
    static int diff(int[] arr){
        //initialise the result
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }

    //Efficient Solution
    static int diff2(int[] arr){
        int res = arr[1]-arr[0];
        int minVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            res = Math.max(res, arr[i]-minVal);
            minVal = Math.min(minVal, arr[i]);
        }

        return res;
    }
}
