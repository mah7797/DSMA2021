/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import com.sun.javafx.font.FontConstants;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

/**
 *
 * @author Mahmoud
 */
public class LinkedList implements List {

    private Object Node(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private class Node{
    Object value;
    Node next;
    public Node(Object value){
        this.value=value;
    }
}
private Node head;
    @Override
    public void add(Object newElement) {
        if(head ==null){
         head=new Node(newElement);
        }
        else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode =currentNode.next;
            }
            currentNode.next=new Node(newElement);
        }
    }

    @Override
    public int indexOf(Object element) {
        Node currentNode=head;
        int index =0;
        while(currentNode!=null){
            if(currentNode.value.equals(element)){
                return index;
            }
            currentNode.next=currentNode;
            index++;
        }
    }

    @Override
    public Object remove(int index) {
        int size=0;
       if(index<0||index>=size){
           throw new ArrayIndexOutOfBoundsException("invalid index"+index);
       }
       final Object ValueToRemove=Node(index).value; 
       return ValueToRemove;
       Node parentNode=head;
        Node currentNode=head;
       while(currentNode!=null){
           parentNode=currentNode;
           currentNode.next=currentNode;
       }
       return currentNode.value;
    }

    @Override
    public boolean remove(Object element) {
        final int indexOfElementToRemove=indexOf(element);
        if(indexOfElementToRemove==-1){
            return false;
        }
        remove(indexOfElementToRemove);
      return false;
    }
    @Override
    public int size(){
        if(head==null){
            return 0;
        }
        else{
       Node currentNode=head;
       int counter=0;
       while(currentNode!=null){
           currentNode=currentNode.next;
           counter++;
       }
    }
    

