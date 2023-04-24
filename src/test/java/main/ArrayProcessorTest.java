package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProcessorTest {

    ArrayProcessor ap;

    @BeforeEach
    void setUp() {
        ap = new ArrayProcessor();
    }

    @Test
    void testMax() {
        double[] arr = {1.2, -4.3, 7.5, 8.5, 9.7, 11.0, 12.4, 3.4};
        double expected = 12.4;
        assertEquals(expected, ap.max(arr), 1e-9);
    }

    @Test
    void testMaxEmptyArray() {
        double[] arr = new double[0];
        try {
            ap.max(arr);
            fail("Array is empty - should be exception");
        } catch (NoSuchElementException e) {
            //it's ok
        } catch (Exception e) {
            fail("Array is empty - but exception is wrong: " + e.getMessage());
        }
    }

    @Test
    void testMaxEmptyArrayEx() {
        double[] arr = new double[0];
        assertThrows(NoSuchElementException.class, () -> ap.max(arr));
    }

    @Test
    void testSum() {
        double[] arr = {1.2, -4.3, 7.5, 3.4, 8.5, 9.7, 11.0, 12.4};
        double expected = 49.4;
        assertEquals(expected, ap.sum(arr), 1e-9);
    }

    @Test
    void testSum2() {
        double[] arr = {1.0, -0.8};
        double expected = 0.2;
        assertEquals(expected, ap.sum(arr), 1e-9);
    }
}