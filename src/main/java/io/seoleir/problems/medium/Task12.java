package io.seoleir.problems.medium;

public class Task12 {

    private final Byte I = 1;

    private final Byte V = 5;

    private final Byte X = 10;

    private final Byte L = 50;

    private final Byte C = 100;

    private final Short D = 500;

    private final Short M = 1000;

    public String intToRoman(int num) {
        StringBuilder romanianNumber = new StringBuilder();

        if (num / 1000 > 0) {
            romanianNumber.append(romanianBuilder(num, "M", null, null, 1000));
            num = num % 1000;
        }

        if (num / 100 > 0) {
            romanianNumber.append(romanianBuilder(num, "C", "D", "M", 100));
            num = num % 100;
        }

        if (num / 10 > 0) {
            romanianNumber.append(romanianBuilder(num, "X", "L", "C", 10));
            num = num % 10;
        }

        if (num > 0) {
            romanianNumber.append(romanianBuilder(num, "I", "V", "X", 1));
        }

        return romanianNumber.toString();
    }

    private String romanianBuilder(Integer number, String start, String middle, String end, Integer divider) {
        switch (number / divider) {
            case 1 -> {
                return start;
            }
            case 2 -> {
                return start.repeat(2);
            }
            case 3 -> {
                return start.repeat(3);
            }
            case 4 -> {
                return start.concat(middle);
            }
            case 5 -> {
                return middle;
            }
            case 6 -> {
                return middle.concat(start);
            }
            case 7 -> {
                return middle.concat(start.repeat(2));
            }
            case 8 -> {
                return middle.concat(start.repeat(3));
            }
            case 9 -> {
                return start.concat(end);
            }
            default -> throw new IllegalArgumentException("Invalid result");
        }
    }
}
