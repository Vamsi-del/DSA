package com.sorting;

public class Sorting {
    private int elements;
    int m=0;
    private int[] array={1,3,2,4,5,62,92,12,78};
    public void selectionSort() {
        for(int out=0;out<array.length;out++){
            int min = out;
            for(int in= out+1;in< array.length;in++){
                if(array[min] < array[in]){
                    min = in;
                }
            }
            int temp=array[out];
            array[out]=array[min];
            array[min]=temp;
        }
    }

    public void bubbleSort() {
        for(int i=array.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            System.out.print(array[i]+" ");
        }
    }

    public void insertionSort() {
        for(int out=1;out<array.length;out++){
            int temp=array[out];
            int in = out;
            while (in>0 && array[in-1]>=temp){
                array[in]=array[in-1];
                --in;
            }
            array[in]=temp;
        }
    }

    public void diaplay() {
        for(int k=0;k< array.length;k++){
            System.out.print(array[k]+" ");
        }
    }
}
