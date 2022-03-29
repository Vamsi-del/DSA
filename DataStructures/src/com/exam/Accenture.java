package com.exam;

import java.util.Scanner;

public class Accenture {
    public static void main(String[] args) {
        int g = 0;
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int original = scan.nextInt();
        int copy = original;
        while(copy != 0){
            int j = copy %10;
            g = g + j;
            copy = copy/10;
        }
        if (original%g == 0)
            System.out.print(0);
        else
            System.out.println(-1);
    }
}
