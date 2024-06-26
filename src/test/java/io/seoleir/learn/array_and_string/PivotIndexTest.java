package io.seoleir.learn.array_and_string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PivotIndexTest {

    private static PivotIndex testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new PivotIndex();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        int[] array = {1, 2, 3, 4, 6};

        int pivotIndex = testObject.pivotIndex(array);

        assertThat(pivotIndex).isEqualTo(3);
    }


}