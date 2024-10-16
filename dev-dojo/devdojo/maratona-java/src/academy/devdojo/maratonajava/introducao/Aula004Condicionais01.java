package academy.devdojo.maratonajava.introducao;

public class Aula004Condicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoVoto = idade >= 16;
        //Pode ser feito assim
        if(isAutorizadoVoto){
            System.out.println("Autorizado a votar");
        }
        if(!isAutorizadoVoto){
            System.out.println("Não está autorizado a votar");
        }
        //Ou assim
        if(isAutorizadoVoto){
            System.out.println("Autorizado a votar");
        }else{
            System.out.println("Não está autorizado a votar");
        }
        //Outra coisa que se pode fazer é
        boolean c = false;
        if(c = true){
            System.out.println("Isso pode ser feito, mas não deve ser feito!");
        }
    }
}
