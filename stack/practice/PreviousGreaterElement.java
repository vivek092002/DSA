package com.DSA.stack.practice;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {15,10,18,12,4,6,2,8};
        int n = arr.length;
        Print(arr,n);
    }

    public static void Print(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int j;
            for ( j = i-1; j >= 0 ; j--) {
                if (arr[j] > arr[i]){
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1){
                System.out.print(-1 + " ");
            }
        }
    }
}
