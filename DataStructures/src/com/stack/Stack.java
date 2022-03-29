package com.stack;

public class Stack {
    int top = -1;
    int size = 0;
    int[] stackArray=new int[100];
    MinStack minStack = new MinStack();
    public void push(int i) {
//        if(minStack.isEmpty() || minStack.peek() >= i){
//            if (minStack.isEmpty()){
//                minStack.push(i);
//            }
//            else if (minStack.peek() != i){
//                System.out.println(minStack.pop());
//                minStack.push(i);
//            }
//        }
        size++;
        stackArray[++top] = i;
    }

    public int pop() {
        size--;
        return stackArray[top--];
    }
    public int getMinimum(){
        return minStack.peek();
    }

    public int peek(){
        return  stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return (top == stackArray.length-1);
    }
    public int[] toArray(){
        int[] array = new int[getSize()];
        for (int i=0;i<getSize();i++){
            array[i] = stackArray[i];
        }
        return array;
    }
}
