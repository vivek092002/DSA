package com.DSA.string.practice;

import java.util.*;

public class Solution {
    public static int maxSplits(String s, String t) {
        int n = s.length();
        int maxSplits = 0;

        // Use two maps to count character frequencies for segments
        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Update character counts for current segment
            freqS.put(s.charAt(i), freqS.getOrDefault(s.charAt(i), 0) + 1);
            freqT.put(t.charAt(i), freqT.getOrDefault(t.charAt(i), 0) + 1);

            // Check if the current segments are anagrams
            if (freqS.equals(freqT)) {
                maxSplits++;  // Valid split found
                freqS.clear();  // Reset for the next segment
                freqT.clear();
            }
        }
        return maxSplits;
    }

    public static void main(String[] args) {
        // Example usage
        String s1 = "aaa";
        String t1 = "aaa";
        System.out.println(maxSplits(s1, t1));  // Output: 3

        String s2 = "aaabc";
        String t2 = "aacab";
        System.out.println(maxSplits(s2, t2));  // Output: 4
    }
}
