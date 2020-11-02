/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Arrays;

/**
 *
 * @author Bilal
 */
public class ArrayList {

    private Object[] list;
    private int effectiveSize;
    private int BUFFER_SIZE = 10;

    public ArrayList() {
        list = new Object[BUFFER_SIZE];
        effectiveSize = 0;
    }

    public void add(Object newElement) {
        if (list.length == effectiveSize) {
            list = Arrays.copyOf(list, list.length + BUFFER_SIZE);
        }
        list[effectiveSize] = newElement;
        effectiveSize++;
    }

    public int size() {
        return effectiveSize;
    }

    public Object remove(int index) {
        if (index < 0 || index >= effectiveSize) {
            throw new ArrayIndexOutOfBoundsException("Invlaid Index " + index);
        }
        final Object valueToRemove = list[index];
        // 1- create a new array
        // 2- copy all the elements from 0 to index-1 from list[i] to newArray[i]
        // 3- copy all the elements from index+1 to effectiveSize-1 from list[i] to newArray[i-1]
        // 4- effectiveSize--
        return valueToRemove;
    }

    public boolean remove(Object element) {
        return false;
    }

    public int indexOf(Object element) {
        return -1;
    }

}
