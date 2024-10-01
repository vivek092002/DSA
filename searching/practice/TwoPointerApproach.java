package com.DSA.searching.practice;

//find if there is a pair with the sum X in a sorted array

public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] arr = {2,4,8,9,11,12,20,30};
        int x = 23;
        System.out.println(isPair1(arr,x));
    }

    //Naive Approach O(n^2)
    public static boolean isPair(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    //two pointer approach
    public static boolean isPair1(int[] arr, int x){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if ((arr[i] + arr[j]) == x){
                return true;
            } else if (arr[i] + arr[j] > x){
                j = j-1;
            } else {
                i = i + 1;
            }
        }
        return false;
    }
}
