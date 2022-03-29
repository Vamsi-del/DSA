package com.company;

public class HighArray {

    int elements,elements1;
    int[] array=new int[100];
    int[] array1=new int[100];

    public void insert(int data){
        elements++;
        int k;
        for(k=0;k<elements;k++){
            if(array[k]<data){
                break;
            }
        }
        for (int m = elements;m>k;m--){
            array[m]=array[m-1];
        }
        array[k]=data;
    }

    public void insert1(int data){
        elements1++;
        int k;
        for(k=0;k<elements1;k++){
            if(array1[k]<data){
                break;
            }
        }
        for (int m = elements1;m>k;m--){
            array1[m]=array1[m-1];
        }
        array1[k]=data;
    }

    public void display() {
        for (int j=0;j<elements;j++){
            System.out.print(array[j]+" ");
        }
//        System.out.println();
//        for (int j=0;j<elements1;j++){
//            System.out.print(array1[j]+" ");
//        }
    }

    public void delete(int i) {
        for(int h=0;h<elements;h++){
            if(array[h]==i){
                for(int l=h;l<elements;l++){
                    array[l]=array[l+1];
                }
                elements--;
            }
        }
    }

    public void linearSearch(int i) {
        for(int f=0;f<elements;f++){
            if(array[f]==i){
                System.out.println();
                System.out.println("Found at Index "+f);
            }
        }
    }

    public void binarySearch(int i) {
        int lowerBound=0;
        int upperBound=elements-1;
        int currentIndex;
        while (true){
            currentIndex=(lowerBound+upperBound)/2;
            if(array[currentIndex] == i){
                System.out.println(i+" Found at index "+currentIndex);
                break;
            }
            else if (lowerBound>upperBound){
                System.out.println(i+" Number Can t be Found in the given data");
                break;
            }
            else{
                if(array[currentIndex]<i){
                    upperBound=currentIndex-1;
                }
                else{
                    lowerBound=currentIndex+1;

                }
            }
        }
    }

    public int getMax(int i) {
        if(array[0] < 0 && array[1] < 0){
            return -1;
        }
        else{
            return array[0];
        }
    }

    public void merge(int[] array, int[] array1) {
        System.out.println();
        Main.elements2 =elements;
        for(int i=0;i<elements;i++){
            Main.mainArray1[i]=array[i];
        }
        int out,temp = 0;
        for(out=0;out<elements1;out++) {
            temp = array1[out];
            int in;
            for (in = 0; in < Main.elements2; in++) {
                if (Main.mainArray1[in] < temp) {
                    break;
                }
            }
            for (int m = Main.elements2; m > in; m--) {
                Main.mainArray1[m] = Main.mainArray1[m - 1];
            }
            Main.elements2++;
            Main.mainArray1[in] = temp;
        }
    }

    public void noDups() {
        for(int i=0;i<elements;i++){
            for(int k=i+1;k<elements;k++){
                if(array[i]==array[k]){
                    array[k]=-1;
                }
                if(array[i]>array[k]){
                    int temp=array[i];
                    array[i]=array[k];
                    array[k]=temp;
                }
            }
        }
        for(int m=0;m<elements;m++){
            for(int l=elements;l>m+1;l--){
                if(array[m]==-1){
                    for(int f=m;f<elements;f++){
                        array[f] = array[f+1];
                    }
                    elements--;
                }
            }
        }
    }

//    public void noDups() {
//        for(int i=0;i<elements;i++){
//            for(int k=elements-1;k>=i+1;k--){
//                if(array[i]==array[k]){
//                    for(int m=k;m<elements;m++){
//                        array[m]=array[m+1];
//                    }
//                    elements--;
//                }
//            }
//        }
//    }

}
