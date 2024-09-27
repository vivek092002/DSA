package com.DSA.recursion.gfg;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "aabbbbbba";
        int start = 0;
        int end = str.length() - 1;
        boolean temp = isPalindrome(str,start,end);
        System.out.println(temp);
    }

    //for recursive palindrome
    static boolean isPalindrome(String str, int start, int end){
        if (start>=end){
            return true;
        }

        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str,start+1,end-1);
    }
}
