package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romario");
        Player player3 = new Player("Cafu");

        //Player[] players = new Player[3];
        //Player[] players = new Player[]{player1, player2, player3};
        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }
    }
}