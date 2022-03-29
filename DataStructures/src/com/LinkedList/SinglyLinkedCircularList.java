package com.LinkedList;

public class SinglyLinkedCircularList {
    private Node first;
    private Node current;
    public void insert(int i) {
        Node newLink = new Node(i , null);
        if(first == null)
            first = newLink;
        else{
            current = first;
            while(current.next != first && current.next != null){
                current = current.next;
            }
            current.next = newLink;
        }
        newLink.next = first;
    }

    public void displayList() {
        current = first;
        while(current.next != first){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public void delete(int i) {
        Node temp = null;
        if(first == null)
            System.out.println("List is Empty");
        else{
            current = first;
            while(current.data != i){
                temp = current;
                current = current.next;
            }
            if(current.next != first) {
                assert temp != null;
                temp.next = current.next;
            }
            else{
                deleteLast();
            }
        }
    }

    private void deleteLast() {
        Node temp = null;
        current = first;
        while (current.next != first){
            temp = current;
            current = current.next;
        }
        assert temp != null;
        temp.next = first;
    }

    public void search(int i) {
        System.out.println();
        if(first == null)
            System.out.println("List is Empty");
        else{
            current = first;
            while(current.data != i){
                current = current.next;
            }

        }
    }
}
