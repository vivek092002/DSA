package com.DSA.searching.gfg;
//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
public class arraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        System.out.println(search(arr,x));
    }

    static int search(int[] arr, int x){

        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid] == x){
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
