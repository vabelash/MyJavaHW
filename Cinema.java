/**
 * Класс фильма в кинотеатре
 */
public class Cinema {
    private String title;
    private String genre;
    private double durationHours;

    public Cinema(String title, String genre, double durationHours) {
        this.title = title;
        this.genre = genre;
        this.durationHours = durationHours;
    }

    // Геттеры
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getDurationHours() { return durationHours; }

    @Override
    public String toString() {
        return title + " (" + genre + ", " + durationHours + " ч)";
    }
}