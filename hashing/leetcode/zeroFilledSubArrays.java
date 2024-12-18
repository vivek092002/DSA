//https://leetcode.com/problems/number-of-zero-filled-subarrays/
package com.DSA.hashing.leetcode;

import java.util.HashMap;

public class zeroFilledSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,0,0,2,0,0,4};

        System.out.println(zeroFilledSubArray(arr));
        System.out.println(countSubArrays(arr));

    }
    //Solution Naive
    public static long zeroFilledSubArray(int[] nums) {
        int count = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                n++;
            } else {
                count += (n * (n+1))/2;
                n=0;
            }
        }

        if (n>0){
            count += (n * (n+1))/2;
        }
        return count;
    }

    //Efficient Solution
    public static int countSubArrays(int[] arr){
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n=arr.length;
        int ans=0;
        int sum=0;
        hs.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            ans += hs.getOrDefault(sum, 0);

            // Update the frequency of the current sum
            hs.put(sum, hs.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

}
