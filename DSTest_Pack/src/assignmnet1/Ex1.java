/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmnet1;

/**
 *
 * @author Bilal
 */
public class Ex1 {

    int x; // default package visibility
    private int y; // only within the class
    public int z;

    public void init() {
        this.x = 0;
        x = 0; // both lines are the same
    }

    public static void main(String[] args) {
        int firstLetter = (int) 'a'; // casting is optional here
        char secondLetter = 98;
        System.out.println("Second letter is = " + secondLetter);
        int age = (int) 1.5;
        System.out.println("Value of firstLetter = " + firstLetter);
        System.out.println("Value of age = " + age);
        new Ex1().y = 3;
        new Ex1().z = 4;
        Ex1 inst1 = new Ex1();
        inst1.init();
    }

}
