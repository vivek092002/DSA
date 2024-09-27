package com.DSA.arrays.practice;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int temp = print2Largest(arr);
        System.out.println(temp);

    }

    private static int print2Largest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }

        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
