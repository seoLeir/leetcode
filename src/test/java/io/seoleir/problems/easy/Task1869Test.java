package io.seoleir.problems.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Task1869Test {

    private static Task1869 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task1869();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        boolean result = testObject.checkZeroOnes("1101");

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Test case #2")
    public void case2() {
        boolean result = testObject.checkZeroOnes("111000");

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Test case #3")
    public void case3() {
        boolean result = testObject.checkZeroOnes("110100010");

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Test case #4")
    public void case4() {
        boolean result = testObject.checkZeroOnes("011000111");

        assertThat(result).isFalse();
    }


}