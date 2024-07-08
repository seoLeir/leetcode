package io.seoleir.problems.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Task3Test {

    private static Task3 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task3();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        String input = "abcabcbb";

        int expectedResult = 3;
        int result = testObject.lengthOfLongestSubstring(input);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Test case #2")
    public void case2() {
        String input = " ";

        int expectedResult = 1;
        int result = testObject.lengthOfLongestSubstring(input);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Test case #3")
    public void case3() {
        String input = "aab";

        int expectedResult = 2;
        int result = testObject.lengthOfLongestSubstring(input);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Test case #4")
    public void case4() {
        String input = "dvdf";

        int expectedResult = 3;
        int result = testObject.lengthOfLongestSubstring(input);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Test case #5")
    public void case5() {
        String input = "asjrgapa";

        int expectedResult = 6;
        int result = testObject.lengthOfLongestSubstring(input);

        assertThat(result).isEqualTo(expectedResult);
    }
}