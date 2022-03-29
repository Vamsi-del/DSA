package com.stack;

public class OperatorStack {
    private int top = -1;
    private int size = 0;
    private int[] operatorArray= new int[10];
    public void push(int data){
        size++;
        operatorArray[++top] = data;
    }

    public int pop(){
        size--;
        return operatorArray[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int peek(){
        return operatorArray[top];
    }

    public int getSize() {
        return size;
    }
    public int[] toArray(){
        int[] array = new int[getSize()];
        for (int i=0;i<getSize();i++){
            array[i] = operatorArray[i];
        }
        return array;
    }
}
