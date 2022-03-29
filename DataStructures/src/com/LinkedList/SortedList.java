package com.LinkedList;

public class SortedList {
    Node first;
    public void insert(int i) {
        Node previous = null;
        Node newLink = new Node(i , null);
        Node sortedLink = first;
        while (sortedLink != null && i > sortedLink.data) {
            previous = sortedLink;
            sortedLink = sortedLink.next;
        }
        if(previous == null)
            first = newLink;
        else
            previous.next =newLink;
        newLink.next = sortedLink;

    }

    public void display() {
        Node display = first;
        while(display != null){
            System.out.println(display.data);
            display = display.next;
        }
    }
}
