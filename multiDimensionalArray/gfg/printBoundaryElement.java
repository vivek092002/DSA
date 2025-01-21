package com.DSA.multiDimensionalArray.gfg;

import java.util.Scanner;

public class printBoundaryElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 4;
        int column = 4;
        int[][] arr = new int[4][4];

        System.out.println("Enter the matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        bTraversal(arr,row,column);
    }

    public static void bTraversal(int[][] arr, int row, int col){
        if (row == 1) {
            for (int i = 0; i < col; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if (col == 1){
            for (int i = 0; i < row ; i++){
                System.out.print(arr[i][0] + " ");
            }
        } else {
            for (int i = 0; i < col; i++) {
                System.out.print(arr[0][i] + " ");
            }
            for (int i = 1; i < row; i++) {
                System.out.print(arr[i][col-1]+ " ");
            }
            for (int i = col-2; i>=0 ; i--){
                System.out.print(arr[row-1][i] + " ");
            }
            for (int i = row-2 ; i>=1 ; i--){
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
