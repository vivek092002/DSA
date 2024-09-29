package com.DSA.arrays.leetcode;
//https://leetcode.com/problems/find-pivot-index/description/
public class pivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivot(nums));
    }

    //O(N)
    public static int pivot(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int left_total = 0;
        for (int i = 0; i < nums.length; i++) {
            int right_total = total -left_total - nums[i];
            if (right_total == left_total){
                return i;
            }
            left_total += nums[i];
        }
        return -1;
    }
}
