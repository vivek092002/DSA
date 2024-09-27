package com.DSA.arrays.gfg;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        reverse(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int n){
        int low = 0;
        int high = n-1;

        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
