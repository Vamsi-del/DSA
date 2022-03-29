package com.sortingproject;

public class BiDirectional {
    int[] array={30,90,70,98,67,100,23,45,47,99,90,123,654,345,12,0,678,768};
    int[] array1={2,5,12,45,32,98,65,1,43,};
    int left = 0, right = array.length-1;
    int elements= array.length-1;

    public void biDirection(){
        while(left<right){
            for(int pos=left;pos<right;pos++){
                if(array[pos]>array[pos+1]){
                    int temp = array[pos+1];
                    array[pos+1]=array[pos];
                    array[pos]=temp;
                }
            }
            right--;

            for(int pos=right;pos>left;pos--){
                if(array[pos] < array[pos-1]){
                    int temp = array[pos-1];
                    array[pos-1]=array[pos];
                    array[pos]=temp;
                }
            }
            left++;
        }

    }

        public void diaplay() {
        for(int k=0;k< array1.length;k++){
            System.out.print(array1[k]+" ");
        }
    }

    public void medianValue() {
        System.out.println();
        if(array.length%2==1){
            System.out.println(array[(array.length/2)]);
        }
        else{
            System.out.println(array[(array.length+array.length+1)/4]);
        }
    }

    public void noDups() {
        for(int out=1;out< array.length-1;out++){
            int temp=array[out];
           for(int in=out;in>0;in--){
               if(temp == array[in-1]){
                   array[out]=array[out+1];
               }
           }
        }
    }

    public void evenOddSort() {
        boolean sorted=false;
        while (!sorted){
            sorted = true;
            for(int j=1;j < array1.length;j=j+2){
                if(array1[j]>array1[j+1]){
                    int temp = array1[j+1];
                    array1[j+1]=array1[j];
                    array1[j]=temp;
                    sorted=false;
                }
            }
            for(int k=0;k<=array1.length-2;k=k+2){
                if(array1[k]>array1[k+1]){
                    int temp1= array1[k+1];
                    array1[k+1]=array1[k];
                    array1[k]=temp1;
                    sorted=false;
                }
            }
        }

    }
}
