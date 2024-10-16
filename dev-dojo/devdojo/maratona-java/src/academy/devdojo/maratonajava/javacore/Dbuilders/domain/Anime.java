package academy.devdojo.maratonajava.javacore.Dbuilders.domain;

public class Anime {
    private String name;
    private String type;
    private Integer episodes;
    private String genre;

    public Anime () {

    }

    public Anime(String name, String type, Integer episodes) {
        //builders
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public Anime(String name, String type, Integer episodes, String genre) {
        //builders
        this(name, type, episodes);
        this.genre = genre;
    }

    public void printer(){
        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Number of episodes : " + this.episodes);
        System.out.println("Genre : " + this.genre);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getEpisodes() {
        return this.episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
