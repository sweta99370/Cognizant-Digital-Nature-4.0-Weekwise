package com.example.test;

import com.example.PerformanceTester;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskCompletesWithinTime() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(500), () -> {
            tester.performTask();
        });
    }
}
