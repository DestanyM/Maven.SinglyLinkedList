package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedListIface {
    private Node<T> head = null;
    public SinglyLinkedList(){}

    public Boolean isEmpty(){
        return head == null;
    }
    @Override
    public void add(Object data) {
        Node newnode = new Node(data);
        if(this.head == null){
            this.head = newnode;
        } else {
            Node<T> temp = head;
            while(temp.hasNext()){
                temp = temp.getNext();
            }
            temp.setNext(newnode);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //add HEAD
        sb.append("head -> ");
        // loop thru the list and print out each data
        if(head != null) {
            Node<T> temp = head;
            do {
                sb.append("[" + temp.getData() + "] -> ");
                temp = temp.getNext();
            }while(temp != null);// && temp.hasNext());


        }
        // add NULL
        sb.append("NULL");
        return sb.toString();
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public int find(Object data) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }
}
