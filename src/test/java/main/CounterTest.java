package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {

    Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
    }

    @Test
    void testIncrement() {
        var actual = counter.increment();
        assertEquals(1, actual);
    }

    @Test
    @Disabled
    void testDoubleIncrement() {
        counter.increment();
        var actual = counter.increment();
        assertEquals(2, actual);
    }

    @Test
    void testDecrement() {
        var actual = counter.decrement();
        assertEquals(-1, actual);
    }

    @Test
    void testIncrementByTwo() {
        var actual = counter.incrementByTwo();
        assertEquals(2, actual);
    }
}