package com.LinkedList;

public class DoubleEndedList {
    private Node first;
    private Node last;
    public void insertFirst(int i) {
        Node newLink = new Node(i , null);
        if(first == null){
            first = newLink;
        }
        else {
            Node n = first;
            while(n.next != null){
                n = n.next;
            }
            n.next = newLink;
            last = newLink;
        }
    }

    public void insertLast(int i) {
        Node newLink = new Node(i,null);
        last.next = newLink;
        last = newLink;
    }

    public void display() {
        Node n = first;
        while(n != null){
            System.out.print(n.data+"  ");
            n = n.next;
        }
    }

    public void deleteFirst() {
        Node n = first;
        if (n.next == null){
            first = null;
        }
        else{
            first = n.next;
        }
    }

    public void deleteLast() {

    }
}
