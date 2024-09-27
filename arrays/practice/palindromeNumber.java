package com.DSA.arrays.practice;

//https://leetcode.com/problems/palindrome-number/
public class palindromeNumber {
    public static void main(String[] args) {
        int x = 363;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        int rev = 0;
        int temp = x;
        while (temp != 0){
            int a = temp % 10;
            rev = rev*10 + a;
            temp = temp/10;
        }
        return (x == rev);
    }
}
