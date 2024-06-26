package io.seoleir.learn.array_and_string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LargestNumberAtLeastTwiceOfOthersTest {

    private static LargestNumberAtLeastTwiceOfOthers testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new LargestNumberAtLeastTwiceOfOthers();
    }

    @Test
    @DisplayName("test case #1")
    public void case1() {
        int[] nums = {3, 6, 1, 0};

        int largestNumberTwiceAsOthersIndex = testObject.dominantIndex(nums);

        assertThat(largestNumberTwiceAsOthersIndex).isEqualTo(1);
    }

}