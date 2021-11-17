package com.Try.JUnitDemo_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.add(2,3));
}
}