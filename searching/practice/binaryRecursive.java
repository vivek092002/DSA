package com.DSA.searching.practice;

public class binaryRecursive {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,100,120,140,180,240};
        int low = 0;
        int high = arr.length;
        int x = 120;
        System.out.println(bSearch(arr,low,high,x));
    }

    static int bSearch(int[] arr, int low, int high, int x){
        if (low>high){
            return -1;
        }

        int mid = (low+high)/2;
        if (arr[mid]==x){
            return mid;
        } else if (arr[mid]>x) {
            return bSearch(arr,low,mid-1,x);
        } else {
            return bSearch(arr,mid+1,high,x);
        }
    }
}
