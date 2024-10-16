package academy.devdojo.maratonajava.javacore.Dbuilders.test;


import academy.devdojo.maratonajava.javacore.Dbuilders.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime favoriteAnime = new Anime("One Piece", "Inspired in Manga", 1100, "Adventure");
        Anime favoriteAnime2 = new Anime();
        favoriteAnime.printer();
        favoriteAnime2.printer();
    }
}
