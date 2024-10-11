package com.study.methods.test;

import com.study.methods.domain.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        float sum, subtraction, multiplication, division;
        float n1 = 54f, n2 = 0f;

        sum = calculator.sum(n1, n2);
        subtraction = calculator.subtract(n1, n2);
        multiplication = calculator.multiply(n1, n2);
        division = calculator.split(n1, n2);

        System.out.println("Sum " + sum);
        System.out.println("Subtraction " + subtraction);
        System.out.println("Multiplication " + multiplication);
        System.out.println("Division " + division);
    }
}
