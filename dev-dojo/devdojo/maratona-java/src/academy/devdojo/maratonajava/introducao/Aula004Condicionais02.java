package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
/*
*nextInt() - Capturar o próximo inteiro;
*
*nextLine() - Capturar a próxima String;
*
*nextFloat() - Capturar o próximo tloat;
*/
public class Aula004Condicionais02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.print("How old are you?");
        age = keyboard.nextInt();

        boolean isVote = age >= 18;

        System.out.println("You are " + age + " years old!");

        if(isVote){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can`t vote!");
        }

    }
}
