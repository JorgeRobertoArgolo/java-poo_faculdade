package com.study.methods.domain;

public class Calculator {

    public Calculator() {}

    public float sum (float n1, float n2) {
        return n1 + n2;
    }

    public float subtract (float n1, float n2) {
        return n1 - n2;
    }

    public float multiply (float n1, float n2) {
        return n1 * n2;
    }

    public float split (float n1, float n2) {
        if (n2 == 0) {
            System.out.println("There is no division by 0");
            return -1;
        }
        return n1 / n2;
    }
}
