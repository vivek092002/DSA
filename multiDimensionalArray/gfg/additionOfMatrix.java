package com.DSA.multiDimensionalArray.gfg;

public class additionOfMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 },{ 4, 5 } };
        int[][] arr2 = { { 5, 6 },{ 8, 9 } };
        add(arr,arr2);
    }

    public static void add(int[][] arr, int[][] arr2){
        int[][] res = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        //printing the 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
