package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Team {
    private String name;
    private Player[] players;

    public void print () {
        System.out.println("--------- Information of the Team ----------");
        System.out.println("Name of the Team : " + this.name);

        if(players == null) return;

        System.out.println("Players : ");
        for(Player player : players) {
            System.out.println("Player's Name : " + player.getName());
        }
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
