package com.company;

import java.util.*;
class Gain{
    static int[] gainOrLoss;
    static int result;
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        gainOrLoss =new int[size-1];
        for(int i=0;i<size;i++){
            gainOrLoss[i] = scan.nextInt();
        }
        for(int j=0;j<size;j++){
            int dummy = 0;
            for(int l=j;l<4+j;l++){
                if(l > gainOrLoss.length){
                    break;
                }
                else{
                    dummy += gainOrLoss[l];
                }
            }
            if(dummy > result){
                result = dummy;
            }
        }
        System.out.println(result);
    }
}
