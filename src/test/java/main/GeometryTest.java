package main;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GeometryTest {

    Geometry geometry;

    @BeforeEach
    void setUp() {
        geometry = new Geometry();
    }

    @Test
    void testAreaOfTriangle() {
        double a = 3;
        double b = 4;
        double c = 5;
        double expected = 6;   // 12, 5, 13  -> 30
        //assertEquals(expected, geometry.areaOfTriangle(a, b, c), 1e-9);
        assertThat(geometry.areaOfTriangle(a, b, c))
                //.as("Area calculated incorrectly")
                .isCloseTo(expected, Percentage.withPercentage(0.1));
    }

    @ParameterizedTest
    @CsvSource({
            "3.0, 4.0, 5.0, 6.0",
            "12.0, 13.0, 5.0, 30.0"
    })
    void testAreaOfTriangleParametrized(double a, double b, double c, double expectedArea) {
        assertThat(geometry.areaOfTriangle(a, b, c))
                .isCloseTo(expectedArea, Percentage.withPercentage(0.1));
    }

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, true",
            "12, 13, 5, true",
            "1, 2, 2, false"
    })
    void testIsRightAngledTriangle(double a, double b, double c, boolean expected) {
        assertThat(geometry.isRightAngledTriangle(a, b, c)).isEqualTo(expected);
    }
}