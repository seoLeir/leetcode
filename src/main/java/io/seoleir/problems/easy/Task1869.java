package io.seoleir.problems.easy;

/**
 * Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's in s, or return false otherwise.
 *
 * For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment of 0s has length 3.
 *
 * Note that if there are no 0's, then the longest continuous segment of 0's is considered to have a length 0. The same applies if there is no 1's.
*/
public class Task1869 {

    public boolean checkZeroOnes(String s) {
        int onesLongestSegment = 0;
        int zerosLongestSegment = 0;

        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == '0') {
                int breakLongestSegment = getBreakCounter(s.substring(i), '0');

                if (breakLongestSegment > 0) {
                    if (breakLongestSegment > zerosLongestSegment) {
                        zerosLongestSegment = breakLongestSegment;
                    }

                    i+= breakLongestSegment;
                } else {
                    int lastSegment = s.substring(zerosLongestSegment).length();

                    if (zerosLongestSegment < lastSegment) {
                        zerosLongestSegment = lastSegment;
                    }
                    break;
                }
            } else if (s.charAt(i) == '1') {
                int breakLongestSegment = getBreakCounter(s.substring(i), '1');

                if (breakLongestSegment > 0) {
                    if (breakLongestSegment > onesLongestSegment) {
                        onesLongestSegment = breakLongestSegment;
                    }

                    i+= breakLongestSegment;
                } else {
                    int lastSegment = s.substring(onesLongestSegment).length();

                    if (onesLongestSegment < lastSegment) {
                        onesLongestSegment = lastSegment;
                    }
                    break;
                }
            } else {
                return false;
            }
        }

        return onesLongestSegment > zerosLongestSegment;
    }

    private int getBreakCounter(String part, char value) {
        int counter = 0;
        for (int i = 0; i < part.length(); i++, counter++) {
            if (part.charAt(i) != value) {
                break;
            }
        } 
        
        return counter;
    }
}
