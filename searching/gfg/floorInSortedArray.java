package com.DSA.searching.gfg;
//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
public class floorInSortedArray {
    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
        int n = arr.length;
        int x = 0;
        System.out.println(findFloor(arr,n,x));
    }

    static int findFloor(long arr[], int n, long x) {
        if (x>=arr[n-1]){
            return n-1;
        }
        
        if (x<arr[0]){
            return -1;
        }

        for (int i = 1; i < n; i++)
            if (arr[i] > x)
                return (i - 1);

        return -1;
    }
}
