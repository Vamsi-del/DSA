package com.priorityQueues;

public class PriorityQueue {
    private int capacity,size,i1;
    private int[] priorityQ;

    public PriorityQueue(int i, int i1) {
        this.capacity = i;
        this.size = i1;
        this.priorityQ=new int[capacity];
    }

    public void insert(int i) {
        if(size == 0){
            priorityQ[size++] = i;
        }
        else{
            for (i1=size-1;i1>=0;i1--){
                if(i > priorityQ[i1]){
                    priorityQ[i1+1] = priorityQ[i1];
                }
                else {
                    break;
                }
            }
            priorityQ[i1+1] = i;
            size++;
        }
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int remove() {
        return priorityQ[--size];
    }

    public int peekMin() {
        return priorityQ[size-1];
    }
}
