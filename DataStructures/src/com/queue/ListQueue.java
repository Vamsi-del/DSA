package com.queue;

import com.LinkedList.DoubleEndedListQueue;

public class ListQueue {
    DoubleEndedListQueue doubleEndedListQueue = new DoubleEndedListQueue();
    public void remove() {
        doubleEndedListQueue.deleteFirst();
    }

    public void add(int i) {
        doubleEndedListQueue.insertLast(i);
    }

    public void displayQueue(){
        doubleEndedListQueue.displayList();
    }

    public boolean isEmpty(){
        return doubleEndedListQueue.empty();
    }
}
