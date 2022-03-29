package com.exam;

import java.util.*;
    class Node{
         int data;
         Node next;
         public Node(){

             }
         public Node(int data){
               this.data=data;
             }
    }
    public class DeletedMain {
        static Node head;

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            for (int i = 0; i < size; i++) {
                append(scan.nextInt());
            }
            System.out.print("Enter the element to be deleted:");
            int delete = scan.nextInt();
            delete(delete);
            display();
        }

        public static void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }

        public static void delete(int data) {
            Node currentNode = head;
            Node prev = null;
            if (head.data==data){
                while(currentNode.data==data){
                    head=currentNode.next;
                    currentNode=currentNode.next;
                }
            }
            else{
                while (currentNode != null) {
                    if (currentNode.data != data) {
                        prev = currentNode;
                    } else {
                        prev.next = currentNode.next;
                    }
                    currentNode = currentNode.next;
                }
            }
        }

        public static void display() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }
