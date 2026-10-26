package anime;

public class Anime {
    // 1. Private properties
    private String title;
    private String genre;
    private int episodes;
    private double rating;

    // 2. Constructor with initial values for main properties
    public Anime(String title, String genre, int episodes, double rating) {
        this.title = title;
        this.genre = genre;
        this.episodes = episodes;
        this.rating = rating;
    }

    // Corresponding getters and setters
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setGenre(String genre) { this.genre = genre; }
    public String getGenre() { return genre; }

    public void setEpisodes(int episodes) { this.episodes = episodes; }
    public int getEpisodes() { return episodes; }

    public void setRating(double rating) { this.rating = rating; }
    public double getRating() { return rating; }

    // 3. Method that performs logic based on properties (outputs full description)
    public void printFullDescription() {
        System.out.println("Title: " + title + "  Genre: " + genre + "  Episodes: " + episodes + "  Rating: " + rating + "/10");
    }
}