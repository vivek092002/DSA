package com.DSA.arrays.gfg;

import java.util.Arrays;

public class leftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //arrays rotated by 1 left
        System.out.println(Arrays.toString(rotate(arr)));
    }

    static int[] rotate(int[] arr ){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;

        return arr;
    }
}
