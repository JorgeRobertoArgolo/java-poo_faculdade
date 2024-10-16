package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime favoriteAnime = new Anime();
        favoriteAnime.init("One Piece", "Inspired in Manga", 1100);
        favoriteAnime.setGenre("Adventure");

        favoriteAnime.printer();
    }
}
