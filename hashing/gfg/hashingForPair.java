package com.DSA.hashing.gfg;

import java.util.HashMap;

public class hashingForPair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = 10;
        int sum = 14;

        System.out.println(sumExists(arr,N,sum));

    }

    public static int sumExists(int[] arr, int N, int sum) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int a = arr[i];
            int more = sum - a;
            if (mpp.containsKey(more)){
                count++;
            }

            mpp.put(arr[i], i);
        }

        return count;
    }
}
