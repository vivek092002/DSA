package com.DSA.string.gfg;

public class palindromeString {
    public static void main(String[] args) {
        String str = "ABBBBA";
        System.out.println(isPalin(str));
    }


    //optimised solution with O(N) and space O(1)
    public static boolean isPalin (String str){
        int begin = 0;
        int end = str.length()-1;

        while (begin<end){
            if (str.charAt(begin) != str.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
