package com.LinkedList;

public class DoublyLinkedList {
    private DoublyNode first;
    private DoublyNode last;

    public void insertFirst(int i) {
        DoublyNode newLink = new DoublyNode(i , null , null);
        if(first == null && last == null){
            first = newLink;
            last = newLink;
        }
        else{
            first.previous = newLink;
            first.previous.next = first;
            first = newLink;
        }
    }

    public void displayForward() {
        DoublyNode current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public void insertLast(int i) {
        DoublyNode newLink = new DoublyNode(i , null , null);
        last.next = newLink;
        last.next.previous = last;
        last = newLink;
    }

    public void deleteFirst() {
        if(first.next == null)
            last = null;
        else
            first.previous = null;
        first = first.next;
    }

    public void deleteLast() {
        if(first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
    }

    public void displayBackward() {
        DoublyNode current = last;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.previous;
        }
    }

    public void insertAfter(int i, int i1) {
        DoublyNode newLink = new DoublyNode(i1 , null , null);
        DoublyNode current = first;
        while(current.data != i){
            current = current.next;
        }
        if(current == last)
            insertLast(i1);
        else {
           newLink.next = current.next;
           current.next.previous = newLink;
           newLink.previous = current;
           current.next = newLink;
        }
    }
}
