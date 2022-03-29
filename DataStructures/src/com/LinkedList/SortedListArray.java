package com.LinkedList;

public class SortedListArray {
    Node first;
    Node n;
    public SortedListArray(Node[] array) {
        for (int j=0;j<array.length;j++){
            insert(array[j]);
        }
    }

    private void insert(Node node) {
        Node previous = null;
        Node current = first;
        while(current != null && node.data > current.data){
            previous =current;
            current = current.next;
        }
        if(previous == null) {
            first = node;
            n = first;
        }
        else
            previous.next = node;
        node.next= current;
    }

    public Node remove(){
        while(n !=  null){
            Node previous = n;
            n = n.next;
            return previous;
        }
        return null;
    }
}
