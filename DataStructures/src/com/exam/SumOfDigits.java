package com.exam;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter any digit");
        Scanner scan = new Scanner(System.in);
        int g = 0;
        int number = scan.nextInt();
        int k = number;
        while(k != 0){
            int j = k % 10;
            g += j;
            k = k / 10;
        }
        int reversed =0;
        int f = g;
        while (f != 0){
            reversed = reversed*10 +g % 10;
            f = f / 10;
        }
        if (reversed == g){
            System.out.println("1");
        }
        else
            System.out.println("0");
    }
}
