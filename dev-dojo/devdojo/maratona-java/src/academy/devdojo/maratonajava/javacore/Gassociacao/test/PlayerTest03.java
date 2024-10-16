package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Cafu");
        Player player2 = new Player("Pele");
        Team team = new Team("Brazil");

        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("------------------- Player Print -------------------");
        player1.print();
        player2.print();
        System.out.println("------------------- Team Print -------------------");
        team.print();
    }
}
