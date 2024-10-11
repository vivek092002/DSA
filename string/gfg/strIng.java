package com.DSA.string.gfg;

public class strIng {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        //for str length
        System.out.println("String length " + str.length());

        //returns char at ith position
        System.out.println(str.charAt(3));

        // Return the substring from the ith index character
        // to end of string
        System.out.println("Substring = " + str.substring(3));

        //Returns the substring from i to j-1 index.
        System.out.println(str.substring(3,5));

        // Concatenates string2 to the end of string1.
        String s = "Vivek";
        String s2 = "Kumar";
        System.out.println("Concatenated String = " + s.concat(s2));

        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality " + out);

        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);

        int out1 = s.compareTo(s2);
        System.out.println("If s1 = s2 " + out);

        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());

        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case " +
                word1.toUpperCase());

        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);
    }
}
