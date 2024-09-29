package com.DSA.arrays.gfg;

public class equilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,9,7};
        System.out.println(ePoint(arr));
    }

    //Naive Solution O(n^2)
    static boolean ePoint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int ls = 0, rs = 0;
            for (int j = 0; j < i; j++) {
                ls += arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                rs += arr[j];
            }

            if (ls == rs){
                return true;
            }
        }
        return false;
    }


}
