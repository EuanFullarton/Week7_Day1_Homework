package example.codeclan.com.week7_day1_homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {

    private Movie[] movies;

    public Ranking() {
        this.movies = new Movie[10];
    }

    public void setMovie(Movie movie) {
        this.movies[movie.getRanking() - 1 ] = movie;
    }

    public Movie getMovieAtRank(int rank) {
        return this.movies[rank - 1];
    }


}

