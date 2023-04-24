package main;

import java.util.Arrays;

public class ArrayProcessor {
    public double max(double[] arr) {
//        double max = arr[0];
//        for (double v : arr) {
//            if (v > max) max = v;
//        }
//        return max;
        return Arrays.stream(arr).max().getAsDouble();
    }

    public double sum(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum;
    }
}
