package io.seoleir.problems.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Task54Test {

    private static Task54 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task54();
    }


    @Test
    @DisplayName("Test case #1")
    public void case1() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> result = testObject.spiralOrder(input);

        List<Integer> expectedResult = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertThat(result).isEqualTo(expectedResult);
    }

}