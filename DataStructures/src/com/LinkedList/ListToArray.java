package com.LinkedList;

import java.util.Random;

public class ListToArray {
    Node[] array = new Node[10];
    public void initializeArray(){
        System.out.print("UnSorted Array: ");
        for(int i=0;i<10;i++){
            Random random = new Random();
            int number = random.nextInt(100);
            Node newLink = new Node(number , null);
            array[i] = newLink;
            System.out.print(array[i].data+"  ");
        }
    }


     public void sortedArray(){
         SortedListArray sortedListArray =new SortedListArray(array);
         for(int  k=0;k<10;k++){
             array[k] = sortedListArray.remove();
         }
     }

     public void displaySortedArray(){
         System.out.print("Sorted Array: ");
         for(int m=0;m<10;m++){
             System.out.print(array[m].data+" ");
         }
     }
}
