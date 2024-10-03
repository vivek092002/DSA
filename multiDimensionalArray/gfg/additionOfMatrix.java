package com.DSA.multiDimensionalArray.gfg;

public class additionOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6}};
        int[][] arr2 = {{1, 3, 3},
                {2, 3, 3}};
        add(arr,arr2);
        //printing the 2d array
    }

    public static void add(int[][] A, int[][] B){
//        int[][] res = new int[2][2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                res[i][j] = arr[i][j] + arr2[i][j];
//            }
//        }

        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
