package com.LinkedList;

public class StackCircularList {
    Node first;

    public void insertFirst(int i) {
        Node newLink = new Node(i , null);
        if(first == null) {
            first = newLink;
        }
        else {
            Node current = first;
            while (current.next != first) {
                current = current.next;
            }
            current.next = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void delete() {
        if(first == null)
            System.out.println("Stack is Empty");
        else{
            Node current = first;
            while(current.next != first){
                current = current.next;
            }
            first = first.next;
            current.next = first;
        }
    }

    public void empty() {
    }

    public void displayStackList() {
        Node current = first;
        while (current.next != first){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print(current.data);
    }
}
