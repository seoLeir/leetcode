package io.seoleir.learn.array_and_string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PlusOneTest {

    private static PlusOne testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new PlusOne();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        int[] array = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};

        int[] arrayPlusOne = testObject.plusOne(array);

        int[] expectedArray = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7};

        assertThat(arrayPlusOne).isNotEmpty();
        assertThat(arrayPlusOne).isEqualTo(expectedArray);
    }

}