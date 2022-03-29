package com.stack;

public class DynamicStackArray {
    private int capacity,top;
    int[] dynamicArray;
    public DynamicStackArray(int i, int i1) {
        this.capacity = i;
        this.dynamicArray=new int[capacity];
        this.top = i1;
    }
    private int minCapacity = 1<<15;

    public int size() {
        return top;
    }

    public void push(int i) {
        if(top == dynamicArray.length-1){
            expandArray();
        }
        dynamicArray[++top] = i;
    }

    private void expandArray() {
        int length = size();
        int[] increasingArraySize = new int[length<<1];
        for(int i = 0;i<dynamicArray.length;i++){
            increasingArraySize[i] = dynamicArray[i];
        }
        dynamicArray = increasingArraySize;
        capacity = capacity<<1;
        top=length;
    }

    public int pop() {
        if(top == 0){
            shrink();
        }
        return  dynamicArray[top--];
    }

    private void shrink() {
        int length = top+1;
        if(length <= minCapacity || top<<2 >=length ){
            return;
        }
        length = length+(top<<1);
        if(top<minCapacity){
            length = minCapacity;
        }
        int[] decrementArraySize = new int[length];
        System.arraycopy(dynamicArray,0,decrementArraySize,0,top+1);
        dynamicArray = decrementArraySize;
        capacity = length;
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}