package io.seoleir.problems.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Task997Test {

    private static Task997 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task997();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        int peopleCount = 2;

        int[][] trustArray = {{1, 2}};

        int judgeLabel = testObject.findJudge(peopleCount, trustArray);

        assertThat(judgeLabel).isEqualTo(2);
    }

    @Test
    @DisplayName("Test case #2")
    public void case2() {
        int peopleCount = 3;

        int[][] trustArray = {{1, 3}, {2, 3}};

        int judgeLabel = testObject.findJudge(peopleCount, trustArray);

        assertThat(judgeLabel).isEqualTo(3);
    }

    @Test
    @DisplayName("Test case #3")
    public void case3() {
        int peopleCount = 4;

        int[][] trustArray = {{1, 3}, {1, 4}, {2, 3}};

        int judgeLabel = testObject.findJudge(peopleCount, trustArray);

        assertThat(judgeLabel).isEqualTo(-1);
    }

    @Test
    @DisplayName("Test case #4")
    public void case4() {
        int peopleCount = 1;

        int[][] trustArray = {};

        int judgeLabel = testObject.findJudge(peopleCount, trustArray);

        assertThat(judgeLabel).isEqualTo(1);
    }

    @Test
    @DisplayName("Test case #4")
    public void case5() {
        int peopleCount = 2;

        int[][] trustArray = {};

        int judgeLabel = testObject.findJudge(peopleCount, trustArray);

        assertThat(judgeLabel).isEqualTo(-1);
    }


}