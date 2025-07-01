package com.example.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.example.EvenChecker;

public class EvenCheckerTest {
    @Test
    void testEven() {
        assertTrue(EvenChecker.isEven(4));
    }
}
