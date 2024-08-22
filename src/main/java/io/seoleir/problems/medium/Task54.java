package io.seoleir.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Task54 {

    /**
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [1,2,3,6,9,8,7,4,5]
    */
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0, r = matrix[0].length - 1, u = matrix.length - 1, d = 0;
        int elS = matrix.length * matrix[0].length;
        List<Integer> lst = new ArrayList<>(elS);
        while (lst.size() < elS) {
            for (int i = l; i <= r; i++) {
                lst.add(matrix[l][i]);
            }
            for (int i = d + 1; i <= u; i++) {
                lst.add(matrix[i][r]);
            }
            if (lst.size() < elS)
                for (int i = r - 1 ; i >= l + 1; i--) {
                    lst.add(matrix[u][i]);
                }
            else break;
            if (lst.size() < elS)
                for (int i = u; i >= l + 1; i--) {
                    lst.add(matrix[i][d]);
                }
            else break;

            l++;
            d++;
            r--;
            u--;
        }
        return lst;
    }
}
