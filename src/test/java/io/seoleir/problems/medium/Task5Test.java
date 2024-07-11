package io.seoleir.problems.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class Task5Test {

    private static Task5 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task5();
    }

    @DisplayName("Test case #1")
    @Test
    public void case1() {
        String word = "babad";

        List<String> expectedResults = List.of("bab", "aba");

        String result = testObject.longestPalindrome(word);

        assertThat(result).isIn(expectedResults);
    }

    @DisplayName("Test case #2")
    @Test
    public void case2() {
        String word = "cbbd";

        List<String> expectedResults = List.of("bb");

        String result = testObject.longestPalindrome(word);

        assertThat(result).isIn(expectedResults);
    }
}