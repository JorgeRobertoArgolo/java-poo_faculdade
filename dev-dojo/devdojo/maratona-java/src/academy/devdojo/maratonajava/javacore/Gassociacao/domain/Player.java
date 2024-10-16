package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Player {
    private String name;
    private Team team;

    public void print () {
        System.out.println("Player Name : " + this.name);
        if (this.team != null) {
            System.out.println("Team : " + team.getName());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
