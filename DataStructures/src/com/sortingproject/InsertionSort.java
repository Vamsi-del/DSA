package com.sortingproject;

public class InsertionSort {
    private int c;
    private int copies,comparistions;
    private int[] array = {98,82,64,34,12,7,5,4,2,1,0};
    private int[] array1 = {2,4,1,1,5,7,9,12,3,4,1,0,12,0};


    public void noOfCopiesAndCompetitions() {
        for(int out=1;out<array.length;out++){
            int temp = array[out];
            ++copies;
            int in=out;
            int shifts=in;
            while (shifts>0){
                if(array[shifts-1]>temp){
                    array[shifts]=array[shifts-1];
                    --in;
                }
                --shifts;
                ++comparistions;
            }
                array[in]=temp;
        }
    }

    public void diaplay() {

        for(int k=0;k< array1.length;k++){
            System.out.print(array1[k]+" ");
        }
//        System.out.println(copies);
//        System.out.println(comparistions);
    }

    public void noDups() {
        for(int out=1;out< array1.length;out++){
            int temp = array1[out];
            int in = out;
            while (in>0  && array1[in-1]>=temp){
                if(temp == array1[in-1]){
                    temp = -1;
                }
                array1[in]=array1[in-1];
                --in;
            }
            array1[in]=temp;
        }
    }

    public void selectionSort() {
        for(int out=0;out<array1.length;out++){
            int min =out;
            for(int in=out+1;in< array1.length;in++){
                if(array1[min]==array1[in]){
                    array1[in]=-1;
                    min = in;
                }
                if(array1[min]>array1[in]){
                    min=in;
                }
            }
            int temp = array1[min];
            array1[min]=array1[out];
            array1[out]=temp;
        }
    }
}
