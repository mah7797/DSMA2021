/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import list.ArrayList;

/**
 *
 * @author Bilal
 */
public class Queue {

    private list.List list = new ArrayList();

    public int size() {
        return list.size();
    }

    public void enqueue(Object element) {
        list.add(element);
    }

    public Object dequeue() {
        return list.remove(0);
    }

}
