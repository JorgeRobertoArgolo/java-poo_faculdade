package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

import java.util.Scanner;

public class CalculatorTest01 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Calculator calculator = new Calculator();
        int option;

        do{
            System.out.println("-------------------------");
            System.out.println("            MENU");
            System.out.println("-------------------------");
            System.out.println("0 - Close Program");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.print("Option : ");
            option = keyboard.nextInt();
            switch(option){
                case 0 :
                    System.out.println("Closing Program!");
                    break;
                case 1:
                    calculator.sum();
                    break;
                case 2:
                    calculator.subtraction();
                    break;
                case 3:
                    calculator.multiplication();
                    break;
                case 4:
                    calculator.division();
                    break;
                default :
                    System.out.println("This Option is Invalid!");
            }
        }while(option != 0);
    }
}
//calculator.sum();
//calculator.subtraction();
//calculator.multiplication();
//calculator.division();