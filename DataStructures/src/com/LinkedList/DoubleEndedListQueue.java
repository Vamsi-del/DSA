package com.LinkedList;

public class DoubleEndedListQueue {
    private Node first;
    private Node last;

    public void insertLast(int data){
        Node newLink = new Node(data , null);
        if(last == null && first == null){
            first = newLink;
            last = newLink;
        }
        else{
            Node n = first;
            while(n.next != null){
                n = n.next;
            }
            n.next = newLink;
            last = n.next;
        }
    }

    public void deleteFirst(){
        Node removingLink = first;
        if(first == null)
            System.out.println("Queue is Empty");
        else{
            first = removingLink.next;
        }
    }

    public void displayList() {
        Node displayData = first;
        while(displayData != null){
            System.out.println(displayData.data);
            displayData = displayData.next;
        }
    }

    public boolean empty(){
        return (first == null && last == null);
    }
}
