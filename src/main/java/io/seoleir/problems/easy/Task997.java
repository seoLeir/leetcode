package io.seoleir.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge. <br/>
 * <br/>
 * If the town judge exists, then: <br/>
 *
 *     The town judge trusts nobody. <br/>
 *     Everybody (except for the town judge) trusts the town judge. <br/>
 *     There is exactly one person that satisfies properties 1 and 2. <br/>
 * <br/>
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. <br/>
 * If a trust relationship does not exist in trust array, then such a trust relationship does not exist. <br/>
 * <br/>
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise. <br/>
 * <br/>
 * Example 1: <br/>
 *
 * Input: n = 2, trust = [[1,2]] <br/>
 * Output: 2 <br/>
 * <br/>
 * Example 2: <br/>
 *
 * Input: n = 3, trust = [[1,3],[2,3]] <br/>
 * Output: 3 <br/>
 * <br/>
 * Example 3: <br/>
 *
 * Input: n = 3, trust = [[1,3],[2,3],[3,1]] <br/>
 * Output: -1 <br/>
*/
public class Task997 {

    /**
     * Сперва заполняю массив с n+1 элементами так как n начинается с 1. <br/>
     * В массие trustCount - храним тех кому поверили (trustCount array index) и сколько раз (value). <br/>
     * В массие trustedCount - храним тех кто поверил (trustedCount array index) и сколько раз(value).  <br/>
     * И в конце проходимся до n-го элемента и находим того к кого поверили n-1 элементов и чтобы он не верил в никого
    */
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];
        int[] trustedCount = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int personA = trust[i][0];
            int personB = trust[i][1];

            trustedCount[personA]++;
            trustCount[personB]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1 && trustedCount[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
