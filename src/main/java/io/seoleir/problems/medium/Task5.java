package io.seoleir.problems.medium;

public class Task5 {


    public String longestPalindrome(String s) {
        int start  = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Расширение полиндрома с одним центром (нечетная длинв)
            int len1 = expandAroundCenter(s, i, i);

            // Расширение полиндрома с двумя центрами (четная длина)
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }


    public int expandAroundCenter(String s, int left, int right) {
        int l = left;
        int r = right;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }
}
