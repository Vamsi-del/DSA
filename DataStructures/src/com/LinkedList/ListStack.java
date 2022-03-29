package com.LinkedList;

public class ListStack {
    private Node first;
    public void insertFirst(int i) {
        Node newLink = new Node(i,null);
        newLink.next = first;
        first = newLink;
    }

    public void deleteFirst() {
        Node n = first;
        if(first == null){
            System.out.println("Stack is Empty");
        }
        else{
            first = n.next;
        }
    }

    public void display(){
        Node n = first;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public boolean empty(){
        return (first == null);
    }
}
