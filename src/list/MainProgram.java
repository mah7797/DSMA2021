/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Mahmoud
 */
public class MainProgram {

    public static void main(String[] args) {
        MovieDB movieDB = new MovieDB();
        movieDB.add(new Movie("Conjuring", 2019));
        movieDB.add(new Movie("Imitation Game", 2016));
        movieDB.add(new Movie("Wild Life", 2010));
        movieDB.add(new Movie("JOKER", 2019));
        movieDB.add(new Movie("Avengers: Endgame", 2018));
        movieDB.display();
    }

}

