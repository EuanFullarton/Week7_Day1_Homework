package example.codeclan.com.week7_day1_homework;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }


    public String getGenre() {
        return genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void setRanking(int newRanking) {
        this.ranking = newRanking;
    }
}
