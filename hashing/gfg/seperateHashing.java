package com.DSA.hashing.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class seperateHashing {
    public static void main(String[] args) {
        int[] arr = {92,4,14,24,44,91};
        int n = 6;
        int hashSize = 10;
        System.out.println(Arrays.toString(new ArrayList[]{separateChaining(arr, n, hashSize)}));
    }

    static public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        //Your code here
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>(hashSize);

        for (int i = 0; i < hashSize; i++) {
            hashTable.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n ; i++){
            int index = arr[i] % hashSize;
            hashTable.get(index).add(arr[i]);
        }

        return hashTable;
    }
}
