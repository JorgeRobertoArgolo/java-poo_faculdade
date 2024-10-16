package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] vet = new int[3][3];
        int contador = 1;
        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet[i].length; j++){
                vet[i][j] = contador;
                contador++;
            }
        }

        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet[i].length; j++){
                System.out.printf("%d ", vet[i][j]);
            }
            System.out.print("\n");
        }
    }
}
