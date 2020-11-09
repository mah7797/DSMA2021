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
public class LinkedList implements List {

    private class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }

    private Node head;

    @Override
    public void add(Object newElement) {
        if (head == null) {
            head = new Node(newElement);
        } else {
            // go to the tail of the list, and create a new node with the newElment
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(newElement);
        }
    }

    @Override
    public Object get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.value;
            }
            count++;
            current = current.next;
        }

        throw new IndexOutOfBoundsException("Invalid index " + index);
    }

    @Override
    public int indexOf(Object element) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value.equals(element)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
//        int count = 0;
//        Node current = head;
//        while(current != null)
//        {
//            current = current.next;
//            count++;
//        }
//        return count;

        if (head == null) {
            return 0;
        } else {
            // head != null
            int size = 1;
            Node current = head;
            while (current.next != null) {
                current = current.next;
                size++;
            }
            return size;
        }
    }

}
