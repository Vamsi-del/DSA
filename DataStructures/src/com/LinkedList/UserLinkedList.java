package com.LinkedList;

public class UserLinkedList {
    Node head;
    int j;
    public void insert(int i) {
        Node node = new Node(i,null);
        if(head == null){
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data , null);
        node.next = head;
        head = node;
    }

    public void insertAt(int i, int i1) {
        Node n = head;
        Node node = new Node(i1,null);
        if( i == 0){
            insertAtStart(i1);
        }
        else {
            while (n.next != null && j != i - 1) {
                j++;
                n = n.next;
            }
            if (j == i - 1) {
                node.next = n.next;
                n.next = node;
            }
        }
    }

    public void removeAt(int i) {
        Node n = head;
        if(i == 0){
            head = n.next;
        }
        else {
            while (n.next != null && j != i - 1) {
                j++;
                n = n.next;
            }
            if (j == i - 1) {
                Node previous = n.next;
                n.next = previous.next;
            }
        }
    }

    public void remove(int i) {
        Node n = head;
        Node n1 = head;
        if(n.data == i){
            head = n.next;
        }
        else {
            while (n.data != i) {
                n1 = n;
                n = n.next;
            }
            Node removingItem = n1.next;
            n1.next = removingItem.next;
        }
    }
}
