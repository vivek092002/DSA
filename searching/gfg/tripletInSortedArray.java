package com.DSA.searching.gfg;

public class tripletInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9,20,40};
        int n = arr.length;
        int target = 32;

        System.out.println(triplet(arr,n,target));
        System.out.println(isTriplet(arr,n,target));

    }
    //Naive Solution   O(n^3)
    public static boolean triplet(int[] arr,int n, int target){
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //efficient solution O(n^2)
    public static boolean isTriplet(int[] arr, int n, int target){
        for (int i = 0; i < n-2; i++) {
            if (isPair(arr, n , target - arr[i], i+1 )){
                return true;
            }
        }
        return false;
    }

    public static boolean isPair(int[] arr, int n, int x, int si){
        int i = si;
        int j = n-1;
        while (i<j){
            if (arr[i] + arr[j] == x){
                return true;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}

