package com.DSA.arrays.gfg;

import java.util.Arrays;

public class removeDupFromSorted {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
        int n = arr.length;
        System.out.println((Arrays.toString(duplicate(arr, n))));
        System.out.println(Arrays.toString(duplicate2(arr,n)));
    }

    //naive method
    static int[] duplicate(int[] arr, int n){
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    //efficient solution
    static int[] duplicate2(int[] arr,int n){
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }

        return arr;
    }
}
