//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
package com.DSA.arrays.practice;

class Solution{
    public static int largest(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        int temp = Solution.largest(arr);
        System.out.println(temp);
    }
}
