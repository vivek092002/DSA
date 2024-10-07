package com.DSA.hashing.leetcode;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];


        List<Integer> list = new ArrayList<>();

        for(int i : nums){
            if(++arr[i] > 1){
                list.add(i);
            }
        }

        return list;
    }
}
