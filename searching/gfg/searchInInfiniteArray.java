package com.DSA.searching.gfg;

public class searchInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1,10,15,20,40,80,90,100};
        int x = 100;
        System.out.println(searchNaive(arr,x));
    }

    public static int searchNaive(int arr[], int x){
        int i = 0;
        while (true){
            if (arr[i] == x){
                return i;
            }
            if (arr[i] > x){
                return -1;
            }
            i++;
        }
    }
}
