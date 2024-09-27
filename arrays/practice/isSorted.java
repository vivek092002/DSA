package com.DSA.arrays.practice;

public class isSorted {

    static boolean issortedornot(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        boolean temp = issortedornot(arr);
        System.out.println(temp);
    }
}
