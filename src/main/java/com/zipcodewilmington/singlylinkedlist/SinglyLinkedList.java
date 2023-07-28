package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    LinkedList<String> linkedList = new LinkedList<>();

    public void add(){
        linkedList.add("John");
        linkedList.add("Mike");
        linkedList.add("Eric");
        linkedList.add("Ryan");
        linkedList.add("Josh");

    }
    public void remove(){
        linkedList.remove(0);
    }

    public void contains(){
        linkedList.contains("Mike");
    }

    public void find(){
        //linkedList.find("Mike");
    }

    public void size(){
        linkedList.size();
    }

    public void get(){
        linkedList.get(0);
    }

    public void copy(){
       // linkedList.copy();

    }

    public void sort(){
       // linkedList.sort();
    }
}
