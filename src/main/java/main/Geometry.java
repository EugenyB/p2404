package main;

public class Geometry {
    public double areaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean isRightAngledTriangle(double a, double b, double c) {
        double eps = 1e-9;
        return Math.abs(a * a + b * b - c * c) < eps ||
                Math.abs(a * a + c * c - b * b) < eps ||
                Math.abs(b * b + c * c - a * a) < eps;
    }
}
