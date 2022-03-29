package com.priorityQueues;

public class FastInsertion {
    private int capacity,size;
    private int top = -1;
    private int[] removeArray;

    public FastInsertion(int i, int i1) {
        this.capacity = i;
        this.removeArray = new int[capacity];
        this.size = i1;
    }


    public void insert(int i) {
        if(size == capacity){
            throw new ArrayIndexOutOfBoundsException("Queue is Full");
        }
        else{
            size++;
            removeArray[++top] = i;
        }
    }

    public void remove(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
        else{
            for(int i=0; i< removeArray.length;i++){
                int min = i;
                for(int j=i+1;j<removeArray.length;j++){
                    if(removeArray[min] < removeArray[j]){
                        min = j;
                    }
                }
                int temp = removeArray[i];
                removeArray[i] = removeArray[min];
                removeArray[min] = temp;
                size--;
                System.out.println(removeArray[i]);
            }
        }
    }

    public boolean isEmpty(){
        return (size == 0);
    }
}
