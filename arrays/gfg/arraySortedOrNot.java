package com.DSA.arrays.gfg;

public class arraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {10,80,103,200};
        boolean res = sorted(arr);
        System.out.println(res);
    }

    public static boolean sorted(int[] arr){
        if ((arr.length==0 || arr.length==1)){
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}
