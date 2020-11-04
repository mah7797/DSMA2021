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
public class ArrayList implements List {

    private Object[] list;
    private int effectiveSize;
    private int BUFFER_SIZE = 10;

    public ArrayList() {
        list = new Object[BUFFER_SIZE];
        effectiveSize = 0;
    }

    @Override
    public void add(Object newElement) {
        if (list.length == effectiveSize) {
            list = Arrays.copyOf(list, list.length + BUFFER_SIZE);
        }
        list[effectiveSize] = newElement;
        effectiveSize++;
    }

    @Override
    public int size() {
        return effectiveSize;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= effectiveSize) {
            throw new ArrayIndexOutOfBoundsException("Invlaid Index " + index);
        }
        return list[index];
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= effectiveSize) {
            throw new ArrayIndexOutOfBoundsException("Invlaid Index " + index);
        }
        final Object valueToRemove = list[index];

        // 1- Keep all the elements from 0 to index-1 from list in place
        // 2- copy all the elements from index+1 to effectiveSize-1 from list[i] to list[i-1]
        // 3- effectiveSize--
        for (int i = index + 1; i < effectiveSize; i++) {
            list[i - 1] = list[i];
        }
        effectiveSize--;

        // 4- if the effectiveSize is divisible by BUFFER_SIZE
        //      create a new array with a size smaller by BUFFER_SIZE
        //      Copy the old array to the new one
        //      replace the "list" attribute by the new array
        if (effectiveSize % BUFFER_SIZE == 0) {
            list = Arrays.copyOf(list, list.length - BUFFER_SIZE);
        }

        return valueToRemove;
    }

    @Override
    public boolean remove(Object element) {
        final int indexOfElementToRemove = indexOf(element);
        if (indexOfElementToRemove == -1) {
            return false;
        }
        remove(indexOfElementToRemove);
        return true;
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

}
