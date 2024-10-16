package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int cont = 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = cont;
                cont++;
            }
        }

        for (int[] arrBase : mat) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

    }
}
