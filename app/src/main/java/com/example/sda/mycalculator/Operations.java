package com.example.sda.mycalculator;

/**
 * Created by sda on 13.05.17.
 */

public class Operations implements Variables {

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) {
        return a * b;
    }

    @Override
    public float divide(float a, float b) {
        return a / b;
    }
}
