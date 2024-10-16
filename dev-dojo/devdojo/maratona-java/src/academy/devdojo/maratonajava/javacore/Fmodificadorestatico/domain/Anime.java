package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private String type;
    private static Integer[] episodes;
    private String genre;

    static {
        /*
        This is initialization block
        This starts before the builder
        */
        System.out.println("Inside the initialization block!");
        episodes = new Integer[12];
        for (Integer i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    public Anime() {
        for(int i = 0; i < episodes.length; i++){
            System.out.print(episodes[i] + " ");
        }
        System.out.println();
    }

    public Anime(String name, String type, Integer[] episodes) {
        //builders
        this.name = name;
        this.type = type;
        Anime.episodes = episodes;
    }

    public Anime(String name, String type, Integer[] episodes, String genre) {
        //builders
        this(name, type, episodes);
        this.genre = genre;
    }

    public void printer(){
        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Number of episodes : " + Anime.episodes[episodes.length - 1]);
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

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static Integer[] getEpisodes() {
        return episodes;
    }
}
