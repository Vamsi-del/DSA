package com.stack;
import com.LinkedList.*;

public class LinkedListStack {
    ListStack listStack = new ListStack();
    public void push(int i) {
        listStack.insertFirst(i);
    }

    public void pop() {
        listStack.deleteFirst();
    }

    public void display() {
        listStack.display();
    }

    public boolean isEmpty(){
        return listStack.empty();
    }
}
