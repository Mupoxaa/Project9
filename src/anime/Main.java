package anime;

public class Main {
    public static void main(String[] args) {
        // 4. Create several objects of this class with initial values
        Anime anime1 = new Anime("Default Title", "Action", 12, 7.0);
        Anime anime2 = new Anime("Default Title", "Drama", 24, 8.0);

        // Set values by using setters
        anime1.setTitle("Attack on Titan");
        anime1.setGenre("Dark Fantasy");
        anime1.setEpisodes(89);
        anime1.setRating(9.1);

        anime2.setTitle("Death Note");
        anime2.setGenre("Psychological Thriller");
        anime2.setEpisodes(37);
        anime2.setRating(9.0);

        // Output full description of every object by calling corresponding method
        anime1.printFullDescription();
        anime2.printFullDescription();
    }
}