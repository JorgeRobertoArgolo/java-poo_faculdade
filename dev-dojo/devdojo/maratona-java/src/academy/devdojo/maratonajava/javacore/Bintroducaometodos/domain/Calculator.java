package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

import java.util.Scanner;

public class Calculator {
    Scanner keyboard = new Scanner(System.in);

    public void sum () {

        System.out.println("-------------------------");
        System.out.println("          SUM");
        System.out.println("-------------------------");
        System.out.println("Enter the first number : ");
        float number1 = keyboard.nextFloat();
        System.out.println("Enter the second number : ");
        float number2 = keyboard.nextFloat();

        float sum = number1 + number2;

        System.out.println("The Sum of " + number1 + " and " + number2 + " is " + sum);
    }

    public void subtraction () {
        System.out.println("-------------------------");
        System.out.println("        SUBTRACTION");
        System.out.println("-------------------------");
        System.out.println("Enter the first number : ");
        float number1 = keyboard.nextFloat();
        System.out.println("Enter the second number : ");
        float number2 = keyboard.nextFloat();

        float subtraction = number1 - number2;

        System.out.println("The Subtraction of " + number1 + " and " + number2 + " is " + subtraction);
    }

    public void multiplication () {
        System.out.println("-------------------------");
        System.out.println("       MULTIPLICATION");
        System.out.println("-------------------------");
        System.out.println("Enter the first number : ");
        float number1 = keyboard.nextFloat();
        System.out.println("Enter the second number : ");
        float number2 = keyboard.nextFloat();

        float multiplication = number1 * number2;

        System.out.println("The Multiplication of " + number1 + " x " + number2 + " is " + multiplication);
    }

    public void division () {
        System.out.println("-------------------------");
        System.out.println("        DIVISION");
        System.out.println("-------------------------");
        System.out.println("Enter the first number : ");
        float number1 = keyboard.nextFloat();
        System.out.println("Enter the second number : ");
        float number2 = keyboard.nextFloat();

        float division = number1 / number2;

        System.out.println("The Division of " + number1 + " / " + number2 + " is " + division);
    }

}
