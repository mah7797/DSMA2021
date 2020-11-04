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
public class MainProgram {

    public static void main(String[] args) {
//        MovieDB movieDB = new MovieDB();
//        movieDB.add(new Movie("Conjuring", 2019));
//        movieDB.add(new Movie("Imitation Game", 2016));
//        movieDB.add(new Movie("Wild Life", 2010));
//        movieDB.display();

        List movieDB = new LinkedList();
        //System.out.println("Before adding any element, the size is: " + movieDB.size());
        movieDB.add(new Movie("Conjuring", 2019));
        movieDB.add(new Movie("Imitation Game", 2016));
        System.out.println("After adding one element, the size is: " + movieDB.size());
        System.out.println("The element is: " + movieDB.get(0));
        movieDB.add(new Movie("Wild Life", 2010));
        System.out.println("After adding three elements, the size is: " + movieDB.size());
        movieDB.remove(1);
        System.out.println("After removing one of the three elements, the size is: " + movieDB.size());
        System.out.println("The remaining elements are: "
                + movieDB.get(0) + " and " + movieDB.get(1));
    }

}
