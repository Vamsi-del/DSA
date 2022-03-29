package com.exam;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        for(int i=2;i<range;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        if(i<=1){
            return false;
        }
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
