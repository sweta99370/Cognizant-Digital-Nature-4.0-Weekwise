package com.example.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    EvenCheckerTest.class,
    OddCheckerTest.class
})
public class AllTests {
    // This class only holds annotations.
}
