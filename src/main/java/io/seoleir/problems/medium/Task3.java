package io.seoleir.problems.medium;

import java.util.*;

/**
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
*/
public class Task3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}