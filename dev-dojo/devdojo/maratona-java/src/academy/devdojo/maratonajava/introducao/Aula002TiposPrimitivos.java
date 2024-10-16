package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {//psvm
        int ageMother = 46;
        long bigNumber = 10000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;//tem que colocar o F quando tiver casa decimal
        byte idadeByte = 46;
        short  idadeShort = 46;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'F';

        //String não é um tipo primitivo
        String name = "Ana Sheila";

        System.out.println("Idade Da Mãe : " + ageMother);
        System.out.printf("Idade Da Mãe : %s\n", ageMother);

        System.out.println("Mother`s name : " + name + "\nAge : " + ageMother + " years old!\n");
    }
}
