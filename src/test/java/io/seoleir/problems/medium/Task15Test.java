package io.seoleir.problems.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class Task15Test {

    private static Task15 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task15();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        int[] input = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = testObject.threeSum(input);

        List<List<Integer>> expectedResult = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

//        assertThat(result).size().isEqualTo(2);
        assertThat(result).containsAll(expectedResult);
    }

    @Test
    @DisplayName("Test case #2")
    public void case2() {
        int[] input = {0, 0, 0};

        List<List<Integer>> result = testObject.threeSum(input);

        List<List<Integer>> expectedResult = List.of(List.of(0, 0, 0));

        assertThat(result.size()).isEqualTo(1);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Test case #3")
    public void case3() {
        int[] input = {0, 1, 1};

        List<List<Integer>> result = testObject.threeSum(input);

        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("Test case #4")
    public void case4() {
        int[] input = {0, 0, 0, 0};

        List<List<Integer>> result = testObject.threeSum(input);
        List<List<Integer>> expectedResult = List.of(List.of(0, 0, 0));

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Test case #5")
    public void case5() {
        int[] input = { -4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0, 0 };

        List<List<Integer>> result = testObject.threeSum(input);
        List<List<Integer>> expectedResult = List.of(
                List.of(-2, -2, 4), List.of(-5, 1, 4), List.of(-4, 1, 3), List.of(-2, 1, 1), List.of(-4, 0, 4), List.of(0, 0, 0)
        );

        assertThat(result).isEqualTo(expectedResult);
    }

}