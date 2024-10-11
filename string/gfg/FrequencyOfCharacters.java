package com.DSA.string.gfg;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        //for storing the alphabet
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {

            //for storing alphabet in the array we sub by ascii value of a
            //just like putting b in count[1] we sub ascii of b with ascii of a for result 1
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0){
                System.out.println((char) (i+'a') + " " + count[i]);
            }
        }
    }
}
