package com.DSA.multiDimensionalArray.gfg;

public class userSpecifiedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {

            // allocates memory for all the single column dynamically
            arr[i] = new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
///////////


//OUTPUT
//0
//1 1
//2 2 2