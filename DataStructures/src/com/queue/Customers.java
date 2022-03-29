package com.queue;

public class Customers {
    private int capacity;
    private int rear1 = -1;
    private int rear2 = -1;
    private int rear3 = -1;
    private int front1,front2,front3 = 0;
    private int size1,size2,size3 = 0;
    private SupermarketStimulation[] line1,line2,line3;

    public Customers(int i) {
        this.capacity = i;
        this.line1 = new SupermarketStimulation[capacity];
        this.line2 = new SupermarketStimulation[capacity];
        this.line3 = new SupermarketStimulation[capacity];
    }


    public boolean isFull() {
        return (size1 == capacity && size2 == capacity && size3 == capacity);
    }

    public void insert(String name,String groceries) {
        if(size1 != capacity){
            size1++;
            line1[++rear1] = new SupermarketStimulation(name,groceries);
        }
        if(size1 == capacity && size2 != capacity) {
            size2++;
            line2[++rear2] = new SupermarketStimulation(name,groceries);
        }
        if (size1 == capacity && size2 == capacity && size3 != capacity){
            size3++;
            line3[++rear3] = new SupermarketStimulation(name,groceries);
        }
    }


    public void remove() {
        if(size1 >= 1){
            size1--;
            System.out.println(line1[front1].name+"  "+line1[front1].groceries);
            front1++;
        }
        if(size2 >= 1){
            size2--;
            System.out.println(line2[front2].name+"  "+line2[front2].groceries);
            front2++;
        }
        if(size3 >= 1){
            size3--;
            System.out.println(line3[front3].name+"  "+line3[front3].groceries);
            front3++;
        }
    }


    public boolean isEmpty() {
        return (size1 == 0 && size2 == 0 && size3 == 0);
    }
}
