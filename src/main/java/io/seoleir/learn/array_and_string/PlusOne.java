package io.seoleir.learn.array_and_string;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int leftLastNineIndexFromEnd = -1;

        for (int j = digits.length - 1; j >= 0; j--) {
            if (digits[j] == 9) {
                leftLastNineIndexFromEnd = j;
            } else {
                break;
            }
        }

        if (leftLastNineIndexFromEnd >= 0) {
            if (leftLastNineIndexFromEnd == 0) {
                int[] newDigits  = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            } else {
                int[] newDigits  = new int[digits.length];
                System.arraycopy(digits, 0, newDigits, 0, leftLastNineIndexFromEnd);
                newDigits[leftLastNineIndexFromEnd - 1] = digits[leftLastNineIndexFromEnd - 1] + 1;
                return newDigits;
            }
        } else {
            int plusOne = digits[digits.length - 1] + 1;
            digits[digits.length - 1] = plusOne;
            return digits;
        }
    }
}
