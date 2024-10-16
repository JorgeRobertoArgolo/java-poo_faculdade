package academy.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula006Condicionais04 {
    public static void main(String[] args) {
        Date clock = new Date();
        //retorna o dia da semana como um valor numérico, onde Domingo é 0 e Sábado é 6.
        int day = clock.getDay();
        switch(day){
            case 0:
                System.out.println("Today is Sunday!");
                break;
            case 1:
                System.out.println("Today is Monday!");
                break;
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is Wednesday!");
                break;
            case 4:
                System.out.println("Today is Thursday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
            default:
                System.out.println("This day is invalid!");
        }
    }
}
