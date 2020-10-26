package assignmnet1;

import java.util.Scanner;

public class MovieCriticsAK {

    public static void main(String[] args) {
        final int nbOfMovies, nbOfAttendees;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of movies to be rated:");
        nbOfMovies = reader.nextInt();
        reader.nextLine();
        String[] movieNames = new String[nbOfMovies];
        for (int i = 0; i < nbOfMovies; i++) {
            System.out.println("Enter the name of movie " + (i + 1) + ":");
            movieNames[i] = reader.nextLine();
        }
        System.out.println("Enter the number of attendees:");
        nbOfAttendees = reader.nextInt();
        System.out.println("==================================");

        int[] minRatings = new int[nbOfMovies];
        int[] maxRatings = new int[nbOfMovies];
        double[] averageRatings = new double[nbOfMovies];
        for (int i = 0; i < minRatings.length; i++) {
            minRatings[i] = 6;
        }

        for (int i = 0; i < nbOfAttendees; i++) {
            System.out.println("Welcome to Cinema Critics!");
            for (int j = 0; j < movieNames.length; j++) {
                System.out
                        .println("Please, enter a rating between 1 and 5 for "
                                + movieNames[j] + ":");
                int rating = reader.nextInt();
                if (rating < minRatings[j]) {
                    minRatings[j] = rating;
                }

                if (rating > maxRatings[j]) {
                    maxRatings[j] = rating;
                }

                averageRatings[j] = averageRatings[j] + rating;
            }
            System.out.println("==================================");
        }

        for (int i = 0; i < averageRatings.length; i++) {
            averageRatings[i] = averageRatings[i] / nbOfAttendees;
        }

        displayResults(movieNames, minRatings, maxRatings, averageRatings);
    }

    protected static void displayResults(String[] movieNames, int[] minRatings,
            int[] maxRatings, double[] averageRatings) {
        System.out.println("Here are the results:");
        System.out.printf("%-15s %-8s %-5s %-5s\n", "Movie Name", "Average",
                "Min", "Max");
        System.out.printf("%-15s %-8s %-5s %-5s\n", "===========", "=======",
                "====", "====");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-15s %7.1f %5d %5d\n", movieNames[i],
                    averageRatings[i], minRatings[i], maxRatings[i]);
        }

        System.out.println();

        double maxAverage = 0;
        for (int i = 0; i < averageRatings.length; i++) {
            if (averageRatings[i] > maxAverage) {
                maxAverage = averageRatings[i];
            }
        }
        int nbOfWinningMovies = 0;
        for (int i = 0; i < averageRatings.length; i++) {
            if (averageRatings[i] == maxAverage) {
                nbOfWinningMovies++;
            }
        }
        if (nbOfWinningMovies == 1) {
            int indexOfMaxAverage = 0;
            for (int i = 0; i < averageRatings.length; i++) {
                if (averageRatings[i] == maxAverage) {
                    indexOfMaxAverage = i;
                }
            }
            System.out.printf(
                    "%s is the winning movie with an average of %.1f!",
                    movieNames[indexOfMaxAverage],
                    averageRatings[indexOfMaxAverage]);
        } else {
            System.out.printf(
                    "The winning movies with an average of %.1f are ",
                    maxAverage);
            for (int i = 0; i < averageRatings.length; i++) {
                if (averageRatings[i] == maxAverage) {
                    System.out.print(movieNames[i] + " ");
                }
            }
        }
    }
}
