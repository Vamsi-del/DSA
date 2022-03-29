package com.exam;

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i=0;i<array.length;i++){
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int highestEle = array[0];
        int highestOcc = -1;
        int count = 0;
        for (int j=0;j<array.length;j++){
            for (int k=0;k<array.length;k++){
                if (array[j] == array[k]){
                    count++;
                }
            }
            int temp = array[j];
            j = j + (count-1);
            if (highestOcc <= count){
                if (highestOcc == count){
                    highestOcc = count;
                    count = 0;
                    if (temp > highestEle){
                        highestEle = temp;
                    }
                }
                else{
                    highestOcc = count;
                    count = 0;
                }
            }
        }
        System.out.println(highestEle);
    }
}