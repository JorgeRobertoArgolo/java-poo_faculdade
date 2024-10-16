package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[4];
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
        idades[3] = 40;
        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
        idades = new int[5];
        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
