package com.stack;

public class MinStack {
    private int top=-1;
    private int[] minArray=new int[10];
    public void push(int data){
        minArray[++top] = data;
    }
    public int pop(){
       return minArray[top--];
    }
    public int peek(){
        return minArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
}
