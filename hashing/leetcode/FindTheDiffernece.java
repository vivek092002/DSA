package com.DSA.hashing.leetcode;
//https://leetcode.com/problems/find-the-difference/description/?envType=problem-list-v2&envId=hash-table
public class FindTheDiffernece {
    public static void main(String[] args) {
        String s =  "abcd";
        String t = "abcde";

        char temp = findTheDifference(s,t);
        System.out.println(temp);
    }

    public static char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++cnt[s.charAt(i) - 'a'];
        }
        for (int i = 0;; ++i) {
            if (--cnt[t.charAt(i) - 'a'] < 0) {
                return t.charAt(i);
            }
        }
    }
}
