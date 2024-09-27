package com.DSA.mathematics.leetcode;

import java.util.Arrays;

public class maxProdOf3Numbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int temp = maximumProduct(nums);
        System.out.println(temp);
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n - 1] * nums[n - 3] * nums[n - 2];
        int b = nums[0] * nums[1] * nums[n - 1];
        int c = Math.max(a, b);
        return c;
    }
}
