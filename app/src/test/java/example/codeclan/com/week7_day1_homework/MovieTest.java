package example.codeclan.com.week7_day1_homework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    @Test
    public void testMovieSetup(){
        Movie movie = new Movie("Die Hard", "Action", 1);
        assertEquals("Die Hard", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void testSetTitle(){
        Movie movie = new Movie("Die Hard", "Action", 1);
        movie.setTitle("Lethal Weapon");
        assertEquals("Lethal Weapon", movie.getTitle());
    }

    @Test
    public void testSetGenre(){
        Movie movie = new Movie("Die Hard", "Action", 1);
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void testSetRanking(){
        Movie movie = new Movie("Die Hard", "Action", 1);
        movie.setRanking(5);
        assertEquals(5, movie.getRanking());
    }

}
