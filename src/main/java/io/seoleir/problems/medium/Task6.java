package io.seoleir.problems.medium;

public class Task6 {

    public static String convert(String s, int numRows) {
        int horizontalLength = s.length() / numRows + s.length() % numRows;

        int[][] arr = new int[numRows][horizontalLength];

        /*int diagonalCounter = horizontalLength - 1;
        int horizontalCounter = 0;

        int diagonalMovesCounter = 0;
        int counter = 0;*/
        int counter = 0;
        int readCounter = 0;
        for (int i = 0; i < arr.length; ) {
            arr[i][counter] = s.charAt(readCounter++);

            if (i == arr.length - 1) {
                counter += numRows - 1;
                if (counter > horizontalLength - 1) {
                    break;
                }

                readCounter += numRows - 2;

                i = 0;

                /*while () {

                }*/
            }

            i++;
        }


        String[][] abc = new String[arr.length][horizontalLength];

        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                abc[i][j] = arr[i][j] == 0 ? "_" : String.valueOf((char) arr[i][j]);
            }
        }


        /*while (horizontalCounter < arr.length ) {
            arr[horizontalCounter][counter] = s.charAt(horizontalCounter);

            if (horizontalCounter == horizontalLength - 1) {

                int horizontalLastIndex = ;
                while () {

                }
            }

            horizontalCounter++;
        }*/


        /*for (int k = 0; k < arr.length; ) {
            arr[k][counter] = s.charAt(k);

            if (k == arr.length - 1) {
                while (diagonalCounter > 0 && horizontalCounter < arr.length) {
                    arr[horizontalCounter++][diagonalCounter - 1] = s.charAt(k);
                    diagonalCounter--;
                }

                diagonalMovesCounter++;
                k = diagonalMovesCounter * numRows;
                counter = counter + numRows - 1;
                continue;
            }

            k++;
        }*/

        return "";
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        int numberRows = 4;

        /*int[][] arr = new int[numberRows][s.length() / numberRows + s.length() % numberRows];

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = counter++;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        convert(s, numberRows);


    }
}
