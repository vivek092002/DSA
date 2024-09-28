package com.DSA.arrays.gfg;

import java.util.Arrays;

public class ZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {10,5,0,0,20,0,0};
        int n = arr.length;
        moveToEnd(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void moveToEnd(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                for (int j = i+1; j < n; j++) {
                    if (arr[j] != 0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
}
