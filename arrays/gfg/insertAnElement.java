package com.DSA.arrays.gfg;

public class insertAnElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int x = 6;
        int cap = 10;
        int n = arr.length;
        int pos = 6;
        int temp = insert(arr,n,x,cap,pos);
        System.out.println(temp);
    }

    static int insert(int[] arr, int n, int x, int cap, int pos){

        //array is full
        if (n==cap){
            return n;
        }
        int index = pos-1;
        for (int i = n-1 ; i >= index ; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = x;
        return (n+1);
    }
}
