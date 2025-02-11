package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

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
            }while(temp != null);
        }
        // add NULL
        sb.append("NULL");
        return sb.toString();
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        Node<T> temp = this.head;
        if(index == 0){
            this.head = this.head.getNext();
        }
        else {
            for(int i = 0; i < index -1; i++){
                if(temp.hasNext()) {
                    temp = temp.getNext();
                }else{
                    throw new IndexOutOfBoundsException();
                }
            }
            temp.setNext((temp.getNext().getNext()));
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        Node<T> temp = this.head;
            for(int i = 0; i < index -1; i++){
                if(temp.hasNext()) {
                    temp = temp.getNext();
                }else{
                    throw new IndexOutOfBoundsException();
                }
            }
            return temp.getData();
        }


    @Override
    public boolean contains(Object data) {
        return (this.find(data) != -1);
    }

    @Override
    public int find(Object data) {
        if(this.isEmpty()) return -1;
        int found = -1;
        Node<T> temp = head;
        do {
            found++;
            if(temp.getData().equals(data)) return found;
            temp = temp.getNext();
        }while(temp != null);
        return -1;
    }

    @Override
    public int size() {
        if(this.isEmpty()) return 0;
        int n = 0;
        Node<T> temp = head;
            do {
                n++;
                temp = temp.getNext();
            }while(temp != null);
        return n;
    }

    @Override
    public SinglyLinkedList copy() {
        SinglyLinkedList<T> copyList = new SinglyLinkedList<>();
        Node<T> temp = this.head;
        while(temp!=null){
            copyList.add(temp.getData());
            temp = temp.getNext();
        }
        return copyList;
    }

    @Override
    public void sort (Comparator comparator) {
        boolean notSorted = true;
        Node<T> temp = this.head;
        Node<T> next;
        while (notSorted){
            notSorted = false;
        }


    }
}
