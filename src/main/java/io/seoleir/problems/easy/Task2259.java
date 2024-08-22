package io.seoleir.problems.easy;

public class Task2259 {

    public String removeDigit(String number, char digit) {
        String h = "";
        char[] arr = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                sb.append(number);
                sb.deleteCharAt(i);
                if (compare(sb.toString(), h) > 0)
                    h = sb.toString();
                sb.setLength(0);
            }
        }
        return h;
    }

    private int compare(String str1, String str2) {
        if (str1.length() > str2.length())
            return 1;
        else if (str1.length() < str2.length())
            return -1;
        else {
            for (int i = 0; i < str1.length(); i++)
                if (str1.charAt(i) > str2.charAt(i))
                    return 1;
                else if (str1.charAt(i) < str2.charAt(i))
                    return -1;
            return 0;
        }
    }
}
