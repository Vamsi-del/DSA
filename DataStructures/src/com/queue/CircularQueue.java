package com.queue;

public class CircularQueue {
    private int rear,front,size, capacity;
    private int[] circularArray;

    public CircularQueue(int i, int i1, int i2, int i3) {
        this.capacity=i;
        this.rear=i1;
        this.front=i2;
        this.size=i3;
        this.circularArray = new int[capacity];
    }

    public void add(int i) {
        if(rear == capacity-1 && front == 0){
            System.out.println("Stack is Full");
        }
        else if (rear == capacity-1 && front > 0){
            rear = -1;
        }
        else {
            size++;
            circularArray[++rear] = i;
        }
    }

    public int remove() {
        size--;
        if(front == capacity){
            front = 0;
        }
            return circularArray[front++];
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
