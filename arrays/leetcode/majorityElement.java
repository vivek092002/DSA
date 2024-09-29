package com.DSA.arrays.leetcode;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {8,3,4,8,8};
        System.out.println(majElement(arr));
        System.out.println(majElement2(arr));
    }

    //Naive Solution O(n^2)
    static int majElement(int[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[j] == arr[i]){
                    count++;
                }
            }
            if (count > n/2){
                return i;
            }
        }
        return -1;
    }


    //efficient solution
    static int majElement2(int[] arr){
        int ans = 0, freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (freq==0){
                ans = arr[i];
            }

            if (ans == arr[i]){
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
}
