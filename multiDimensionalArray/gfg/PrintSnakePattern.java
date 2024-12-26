package com.DSA.multiDimensionalArray.gfg;

public class PrintSnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6}};
        int row = 2;
        int column = 3;
        print(arr,row,column);
    }

    public static void print(int[][] arr, int row, int column){

        for (int i = 0; i < row; i++) {
            if (i%2==0){
                for (int j = 0; j < column; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = column-1; j >= 0 ; j--) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}

// 1 2 3 6 5 4
