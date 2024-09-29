package com.DSA.arrays.gfg;

//a[]={5,10,20,6,3,8}
//returns 3 as longest alternating even odd length is 3

public class evenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {5,10,20,6,3,8};
        System.out.println(maxEvenOdd(arr));
        System.out.println(maxEvenOdd2(arr));
    }

    //naive solution
    static int maxEvenOdd(int[] arr){
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i+1; j < n; j++) {
                if ((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j-1]%2==0 && arr[j]%2!=0)){
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }

    //efficient solution
    static int maxEvenOdd2(int[] arr){
        int n = arr.length;
        int res = arr[0];
        int curr = arr[0];
        for (int i = 1; i < n; i++) {
            if ((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i-1]%2==0 && arr[i]%2!=0)){
                curr++;
                res = Math.max(curr,res);
            }else {
                curr=1;
            }
        }
        return res;
    }
}
