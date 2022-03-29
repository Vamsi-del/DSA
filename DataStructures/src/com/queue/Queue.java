package com.queue;

public class Queue {
    private int capacity,rear,front,size;
    private int[] queueArray;

    public Queue(int i, int i1, int i2, int i3) {
        this.capacity = i;
        this.queueArray = new int[capacity];
        this.rear = i1;
        this.front = i2;
        this.size = i3;

    }

    public void insert(int i) {
        if(rear == queueArray.length-1){
            throw new ArrayIndexOutOfBoundsException("Stack is Full");
        }
        size++;
        queueArray[++rear] = i;
    }

    public int remove() {
        if(front == rear+1){
            throw new ArrayIndexOutOfBoundsException("Stack is Empty");
        }
        size--;
        return queueArray[front++];
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public int size() {
        return size;
    }
}
