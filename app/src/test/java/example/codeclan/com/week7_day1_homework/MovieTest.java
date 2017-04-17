package example.codeclan.com.week7_day1_homework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Die Hard", "Action", 1);
    }


    @Test
    public void testMovieSetup() {
        assertEquals("Die Hard", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void testSetTitle() {
        movie.setTitle("Lethal Weapon");
        assertEquals("Lethal Weapon", movie.getTitle());
    }

    @Test
    public void testSetGenre() {
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void testSetRanking() {
        movie.setRanking(5);
        assertEquals(5, movie.getRanking());
    }

    @Test
    public void testPrintMovieDetails() {
        assertEquals("Title: 'Die Hard', Genre: 'Action', Ranking: 1", movie.printMovieDetails();)
    }

}
