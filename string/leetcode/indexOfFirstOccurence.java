//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
package com.DSA.string.leetcode;

public class indexOfFirstOccurence {
    public static void main(String[] args) {
        String hayStack = "geeksforgeeks";
        String needle = "for";

        System.out.println(strStr(hayStack,needle));
    }
    public static int strStr(String hayStack, String needle){
        if (needle.length() > hayStack.length()){
            return -1;
        }

        int left = 0; int right = needle.length();
        while (right <= hayStack.length()){
            String str = hayStack.substring(left,right);
            if (str.equals(needle)){
                return left;
            }
            left++;
            right++;
        }

        return -1;
    }
}
