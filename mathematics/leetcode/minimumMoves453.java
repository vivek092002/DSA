package com.DSA.mathematics.leetcode;
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
public class minimumMoves453 {
    public static void main(String[] args) {

    }
    public static int minMoves(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max<nums[i])
                max = nums[i];
        }
        return max;
    }
}
