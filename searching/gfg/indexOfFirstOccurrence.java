package com.DSA.searching.gfg;

public class indexOfFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {5,10,10,20,20,20};
        int x = 10;
        System.out.println(FirstIndex(arr,x));
        System.out.println(FirstIndex1(arr,x));
    }


    //O(N) Solution
    static int FirstIndex(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    //Efficient Solution
    //O(logN)
    static int FirstIndex1(int[] arr, int x){
        int low = 0;
        int high = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>x){
                high = mid -1;
            } else if (arr[mid] < x) {
                low = mid +1;
            } else if (mid==0 || arr[mid-1] != arr[mid]) {
                return mid;
            } else {
                high = mid-1;
            }
        }

        return -1;
    }
}
