package com.DSA.arrays.gfg;

import java.util.Arrays;

public class leftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int d = 2;
        leftRot(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }


    //naive theorem
    static int[] leftByOne(int[] arr, int n){
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }

    static int[] leftRotate(int[] arr, int n, int d){
        for (int i = 0; i < d; i++) {
            leftByOne(arr,n);
        }
        return arr;
    }

    //optimised solution
    static void leftRot(int[] arr, int n, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }

    static void reverse(int[] arr, int low, int high){
        while (low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
