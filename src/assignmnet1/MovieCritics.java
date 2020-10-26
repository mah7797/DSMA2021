/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmnet1;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class MovieCritics {

    public static void main(String[] args) {
        System.out.println("Welcome to...");
        System.out.println("Please enter the number of movies:");
        Scanner inFromKeyboard = new Scanner(System.in);
        final int nbMovies = inFromKeyboard.nextInt();
        // reads the new line symbol after the integer from the keyboard buffer
        inFromKeyboard.nextLine();

        String[] movieNames = new String[nbMovies];
        for (int i = 0; i < nbMovies; i++) {
            System.out.println("Please enter the name of the movie number " + (i + 1) + ":");
            movieNames[i] = inFromKeyboard.nextLine();
        }

        System.out.println("Please enter the number of attendees:");
        final int nbAttendees = inFromKeyboard.nextInt();

        int[] minRatings = new int[nbMovies];
        int[] maxRatings = new int[nbMovies];
        double[] averageRatings = new double[nbMovies];
        for (int i = 0; i < nbMovies; i++) {
            minRatings[i] = Integer.MAX_VALUE; // or 6 is enough
            maxRatings[i] = Integer.MIN_VALUE; // not needed; the default 0 value is enough
            averageRatings[i] = 0.0; // not needed; Java initializes the arrays to zeros by default
        }
        for (int i = 0; i < nbAttendees; i++) {
            System.out.println("Welcome to...");
            for (int j = 0; j < nbMovies; j++) {
                System.out.println("Please enter a rating between 1 & 5 for the '"
                        + movieNames[j] + "' movie:");
                final int rating = inFromKeyboard.nextInt();
                if (rating < minRatings[j]) {
                    minRatings[j] = rating;
                }
                if (rating > maxRatings[j]) {
                    maxRatings[j] = rating;
                }
                averageRatings[j] += rating;
            }
        }

        for (int i = 0; i < nbMovies; i++) {
            // this is the same as averageRatings[i] = averageRatings[i] / nbAttendees;
            averageRatings[i] /= nbAttendees;
            System.out.println("Movie '"
                    + movieNames[i] + "' has: min="
                    + minRatings[i] + ", max="
                    + maxRatings[i] + ", average="
                    + averageRatings[i]);
        }

        // Dsiplay the winning movie
        int indexOfWinningMovie = -1;
        double winningAverage = Double.MIN_VALUE; // like -infinite
        for (int i = 0; i < nbMovies; i++) {
            if (winningAverage < averageRatings[i]) {
                winningAverage = averageRatings[i];
                indexOfWinningMovie = i;
            }
        }

        System.out.println("The winning movie is "
                + movieNames[indexOfWinningMovie] + " with an average of "
                + averageRatings[indexOfWinningMovie]); // winningAverage is also OK.
    }

}
