package com.queue;

public class Dequeue {
    private int rear,front,capacity;
    private int[] dequeue ;

    public Dequeue(int i, int i1, int i2) {
        this.capacity=i;
        this.rear=i1;
        this.front=i2;
        this.dequeue = new int[capacity];
    }

    public void enqueueFront(int i) {
        if (rear == -1 && front == -1){
            front=rear=0;
            dequeue[front] = i;
        }
        else if (rear == capacity-1 && front == 0 || front == rear+1){
            throw new ArrayIndexOutOfBoundsException("Stack is Full");
        }
        else if (front == 0){
            front = capacity-1;
            dequeue[front] = i;
        }
        else{
            front--;
            dequeue[front] = i;
        }
    }

    public void enqueueRear(int i) {
        if (rear == -1 && front == -1){
            front=rear=0;
            dequeue[rear] = i;
        }
        else if (rear == capacity-1 && front == 0 || front == rear+1){
            throw new ArrayIndexOutOfBoundsException("Stack is Full");
        }
        else if (rear == capacity-1){
            rear = 0;
            dequeue[rear] = i;
        }
        else{
            rear++;
            dequeue[rear] = i;
        }
    }

    public void display() {
        int i =front;
        while(i != rear){
            System.out.println(dequeue[i]);
            i = (i+1)%capacity;
        }
        System.out.println(dequeue[rear]);
    }

    public void dequeueRear() {
        if (rear == -1 && front == -1){
            throw new ArrayIndexOutOfBoundsException("Array is Empty");
        }
        else if(rear == 0){
            System.out.println(dequeue[rear]);
            rear = capacity-1;
        }
        else if (rear == front){
            front = rear =-1;
        }
        else{
            System.out.println(dequeue[rear]);
            rear--;
        }

    }

    public void dequeueFront() {
        if(front == -1 && rear == -1){
            throw new ArrayIndexOutOfBoundsException("Stack is Empty");
        }
        else if (front == capacity-1){
            System.out.println(dequeue[front]);
            front = 0;
        }
        else if (front == rear){
            front = rear = -1;
        }
        else{
            System.out.println(dequeue[front]);
            front++;
        }
    }
}
