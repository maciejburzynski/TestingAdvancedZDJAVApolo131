package sda.TestingZDJAVApolo131.testingadvanced.tdd;

import sda.TestingZDJAVApolo131.testingadvanced.exception.DividingByZeroException;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            throw new DividingByZeroException("Dividing by 0 detected");
        } else {
            return x / y;
        }
    }
}
