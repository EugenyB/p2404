package main;

public class Counter {

    private int value = 0;

    public int increment() {
        return ++value;
    }

    public int decrement() {
        return --value;
    }

    public int incrementByTwo() {
        return value += 2;
    }
}
