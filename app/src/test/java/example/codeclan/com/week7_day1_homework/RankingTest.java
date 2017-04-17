package example.codeclan.com.week7_day1_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Ranking ranking;

    @Before
    public void before() {
        movie1 = new Movie("Die Hard", "Action", 1);
        movie2 = new Movie("Lethal Weapon", "Action", 2);
        movie3 = new Movie("Dumb and Dumber", "Comedy", 3);
        movie4 = new Movie("The Hobbit", "Adventure", 4);
        movie5 = new Movie("Police Academy", "Action", 5);
        movie6 = new Movie("Memento", "Thriller", 6);
        movie7 = new Movie("Dark Knight", "Thriller", 7);
        movie8 = new Movie("Beauty and the Beast", "Romance", 8);
        movie9 = new Movie("The Ring", "Horror", 9);
        movie10 = new Movie("The Grinch", "Family", 10);
        ranking = new Ranking();
    }

    @Test
    public void testSetMovie() {
        Movie movie = new Movie("Roadtrip", "Comedy", 5);

        ranking.setMovie(movie);

        Movie movie5 = ranking.getMovieAtRank(5);
        assertEquals("Roadtrip", movie5.getTitle());
    }

    @Test
    public void testGetMovieAtRanking() {
        ranking.getMovieAtRank(9);
        assertEquals("The Ring", movie9.getTitle());
    }
}
