package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static int elements2;
    static int[] mainArray = new int[100];
    static int[] mainArray1 = new int[100];
    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        HighArray highArray = new HighArray();
        highArray.insert(10);
        highArray.insert(2);
        highArray.insert(2);
        highArray.insert(3);
        highArray.insert(45);
        highArray.insert(1);
        highArray.insert(0);
        highArray.insert(3);
        highArray.insert(45);
        highArray.insert(1);
        highArray.insert(0);
        highArray.insert(3);
        highArray.insert(1);
        highArray.insert(0);
        highArray.insert(3);
        highArray.insert(45);
        highArray.insert(1);
        highArray.insert(0);
        highArray.display();
//        highArray.insert1(random.nextInt(100));
//        highArray.insert1(random.nextInt(100));
//        highArray.insert1(random.nextInt(100));
//        highArray.insert1(random.nextInt(100));
//        highArray.insert1(random.nextInt(100));
//        highArray.insert1(random.nextInt(100));
//        highArray.display();
        highArray.noDups();
        System.out.println();
        highArray.display();
//        highArray.merge(highArray.array,highArray.array1);
//        highArray.display();
//        highArray.delete(45);
//        highArray.linearSearch(10);
//        highArray.linearSearch(0);
//        highArray.binarySearch(0);
//        int i = highArray.getMax(0);
//        System.out.println(i);
//        highArray.delete(i);
//        highArray.display();
//        selectionSorting(highArray.array,highArray.elements);
//        System.out.println();
//        for(int i=0;i<elements2;i++){
//            System.out.print(mainArray1[i]+" ");
//        }
    }

    private static void selectionSorting(int[] array, int elements) {
        System.out.println();
        mainArray=array;
        for(int out=0;out<elements;out++){
            int min = out;
            for(int in=out+1;in<elements;in++){
                if(mainArray[min]>mainArray[in]){
                    int temp=mainArray[min];
                    mainArray[min]=mainArray[in];
                    mainArray[in]=temp;
                }
            }
            System.out.print(mainArray[out]+" ");
        }
    }
}
