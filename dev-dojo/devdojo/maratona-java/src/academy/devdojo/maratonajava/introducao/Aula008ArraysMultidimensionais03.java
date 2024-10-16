package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[] arrayBasic = {1, 2, 3};
        int[][] arrayInt1 = new int[3][];

        arrayInt1[0] = new int[2];
        arrayInt1[1] = arrayBasic;
        arrayInt1[2] = new int[]{1, 2, 3, 4, 5, 6};

        for(int[] arrayBase : arrayInt1){
            for(int num : arrayBase){
                System.out.printf("%d ", num);
            }
            System.out.print("\n");
        }

        System.out.println("\n---------------------------");

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for(int[] arrayBase : arrayInt2){
            for(int num : arrayBase){
                System.out.printf("%d ", num);
            }
            System.out.print("\n");
        }

    }
}
