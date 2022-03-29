package com.exam;

import java.util.Scanner;

public class PrimeNumber {
    static boolean flag = true;
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            int m = number/2;
            for (int i = 2; i <= 100; i++) {
                if (number % i == 0) {
                    System.out.println("Number is Not Prime Number");
                    flag = false;
                    break;
                }
            }
        if(flag){
            System.out.println("i");
        }
    }
}
