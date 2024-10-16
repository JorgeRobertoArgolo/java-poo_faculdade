package academy.devdojo.maratonajava.introducao;

public class Aula005Condicionais03 {
    public static void main(String[] args) {
        int idade = 16;
        String voto = "";

        voto = ((idade >= 16) ? "Voto Liberado!" : "Não pode votar!");

        System.out.println(voto);
    }
}
