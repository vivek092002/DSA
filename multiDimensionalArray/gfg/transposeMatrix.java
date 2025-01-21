package com.DSA.multiDimensionalArray.gfg;

import java.util.Scanner;

public class transposeMatrix {
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

        transpose(arr, row, column);

    }

    public static void transpose(int[][] arr, int row, int col){
        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
