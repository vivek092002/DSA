package com.DSA.searching.gfg;

public class indexOfLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {5,10,10,10,10,20,20};
        int x = 10;
        System.out.println(LastIndex(arr,x));
    }

    static int LastIndex(int[] arr, int x){
        int low = 0;
        int high = arr.length;
        int res = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid] > x){
                high = mid-1;
            } else if (arr[mid] < x) {
                low = mid+1;
            } else {
                res = mid;
                low = mid+1;
            }
        }
        return res;
    }
}
