package com.example.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import com.example.EvenChecker;

public class OddCheckerTest {
    @Test
    void testOdd() {
        assertFalse(EvenChecker.isEven(5));
    }
}
