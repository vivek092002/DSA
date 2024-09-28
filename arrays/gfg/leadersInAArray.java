package com.DSA.arrays.gfg;

public class leadersInAArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leaders(arr);
    }

    static void leaders(int[] arr){
        int n = arr.length;
        int curr = arr[n-1];
        System.out.println(curr);

        //traversing for the back for leader
        for (int i = n-2; i > 0 ; i--) {
            if (curr < arr[i]){
                curr = arr[i];
                System.out.println(" " + curr);
            }
        }
    }
}
