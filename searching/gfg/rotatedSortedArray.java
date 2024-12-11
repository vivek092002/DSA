package com.DSA.searching.gfg;

public class rotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,8,9};
        int n = arr.length;
        int target = 30;
        System.out.println(search(arr,n,target));
    }

    public static int search(int arr[], int n, int x){
        int low = 0, high = n-1;
        while (low <= high){
            int mid = (low + high ) / 2;
            if (arr[mid] == x){
                return mid;
            }
            //left is sorted or not
            if (arr[low] <= arr[mid]){
                if (arr[low] <= x  && arr[mid] > x){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else
            //right half is sorted or not
            {
                if (x > arr[mid] && arr[high] >= x){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
