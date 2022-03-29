package com.stack;

import com.LinkedList.*;

public class CircularStack {
    StackCircularList stackCircularList = new StackCircularList();
    public void push(int i) {
        stackCircularList.insertFirst(i);
    }

    public void pop() {
        stackCircularList.delete();
    }

    public void isEmpty() {
        stackCircularList.empty();
    }

    public void display() {
        stackCircularList.displayStackList();
    }
}
