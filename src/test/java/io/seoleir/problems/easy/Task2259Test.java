package io.seoleir.problems.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Task2259Test {

    private static Task2259 testObject;

    @BeforeAll
    public static void setUp() {
        testObject = new Task2259();
    }

    @Test
    @DisplayName("Test case #1")
    public void case1() {
        String result = testObject.removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471", '3');

        String actualResult = "299858953917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
        assertThat(result).isEqualTo(actualResult);
    }

}