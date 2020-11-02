/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Bilal
 */
public class MovieDB {

    private static final int BUFFER_SIZE = 2;
    int effectiveNbMovies = 0;
    Movie[] moviesList = new Movie[BUFFER_SIZE];

    public void add(Movie movie) {
        // check if the array is already full
        if (moviesList.length == effectiveNbMovies) {
            // increase the size of the array
            // ???
            // 1- create a new array of larger size (BUFFER_SIZE * 2),
            //    then copy the previous elements,
            //    and finally add the new one
            // 2- Arrays.copyOf()... check it from the JavaDoc
            Movie[] newMoviesList = new Movie[moviesList.length + BUFFER_SIZE];
            // DO NOT DO: newMoviesList = moviesList;
            for (int i = 0; i < moviesList.length; i++) {
                newMoviesList[i] = moviesList[i];
            }
            moviesList = newMoviesList;
            // The following is equivalent to the above for loop
            // moviesList = Arrays.copyOf(moviesList, moviesList.length + BUFFER_SIZE);

        }
        moviesList[effectiveNbMovies] = movie;
        effectiveNbMovies++;
    }

    void display() {
        for (int i = 0; i < effectiveNbMovies; i++) {
            Movie movie = moviesList[i];
            System.out.println("Movie: " + movie.getName() + ", " + movie.getReleaseYear());
        }
        // Equivalent to
        // for each variable "movie" of type "Movie" in "moviesList", do...
//        for (Movie movie : moviesList) {
//            System.out.println("Movie: " + movie.getName() + ", " + movie.getReleaseYear());
//        }
    }

}
