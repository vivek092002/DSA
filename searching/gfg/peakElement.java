package com.DSA.searching.gfg;

public class peakElement {
    public static void main(String[] args) {
        int[] arr = {5,10,20,15,7};
        int n = arr.length;
        System.out.println(peakAElement(arr,n));
    }
    public static int peakAElement(int[] arr, int n){

        //corner cases
        if (n==1){
            return 0;
        }
        if (arr[0] > arr[1]){
            return 0;
        }
        if (arr[n-1] > arr[n-2]){
            return n-1;
        }

        //binary search
        int low = 1, high = n-2;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid] > arr[mid-1]){
                low = mid+1;
            } else if (arr[mid] > arr[mid+1]){
                high = mid -1;
            }
        }
        return 0;
    }
}
