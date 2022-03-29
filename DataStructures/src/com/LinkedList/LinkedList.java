package com.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {
    public static void main(String[] args) {
//        UserLinkedList userLinkedList = new UserLinkedList();
//        userLinkedList.insert(5);
//        userLinkedList.insert(35);
//        userLinkedList.insert(25);
//        userLinkedList.insert(15);
//        userLinkedList.insertAtStart(45);
//        userLinkedList.insertAt(2,75);
//        userLinkedList.removeAt(0);
//        userLinkedList.remove(75);
//        userLinkedList.show();

//        DoubleEndedList doubleEndedList = new DoubleEndedList();
//        doubleEndedList.insertFirst(6);
//        doubleEndedList.insertFirst(12);
//        doubleEndedList.insertLast(5);
//        doubleEndedList.insertFirst(18);
//        doubleEndedList.insertFirst(24);
//        doubleEndedList.insertLast(3);
//        doubleEndedList.insertLast(9);
//        doubleEndedList.deleteFirst();
//        doubleEndedList.deleteLast();
//        doubleEndedList.display();

//        SortedList sortedList = new SortedList();
//        sortedList.insert(67);
//        sortedList.insert(36);
//        sortedList.insert(100);
//        sortedList.insert(75);
//        sortedList.insert(74);
//        sortedList.insert(30);
//        sortedList.insert(23);
//        sortedList.display();

//        ListToArray listToArray = new ListToArray();
//        listToArray.initializeArray();
//        listToArray.sortedArray();
//        listToArray.displaySortedArray();

//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
//        doublyLinkedList.insertFirst(6);
//        doublyLinkedList.insertFirst(61);
//        doublyLinkedList.insertFirst(62);
//        doublyLinkedList.insertLast(7);
//        doublyLinkedList.insertLast(71);
//        doublyLinkedList.insertLast(72);
//        doublyLinkedList.insertAfter(7,70);
//        doublyLinkedList.insertAfter(70,79);
//        doublyLinkedList.deleteFirst();
//        doublyLinkedList.deleteLast();
//        doublyLinkedList.deleteLast();
//        doublyLinkedList.displayForward();
//        doublyLinkedList.displayBackward();

//        SinglyLinkedCircularList singlyLinkedCircularList = new SinglyLinkedCircularList();
//        singlyLinkedCircularList.insert(10);
//        singlyLinkedCircularList.insert(20);
//        singlyLinkedCircularList.insert(30);
//        singlyLinkedCircularList.insert(40);
//        singlyLinkedCircularList.delete(40);
//        singlyLinkedCircularList.displayList();
//        singlyLinkedCircularList.search(30);

        while(true){
            System.out.println("Enter a String of Number : ");
            System.out.flush();
            String input = getString();
            if(input == null)
                break;
            Matrix matrix = new Matrix();
            matrix.get(input);
        }
    }

    private static String getString() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}