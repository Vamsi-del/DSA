package com.exam;

import java.util.Scanner;

public class Abc {
    static long result;
    public static void main(String[] args) {
        long val = 0;
        System.out.println("Enter the Number to be drawn");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        for(int i=0;i<value;i++){
            for(int j=i;j<i+1;j++){
                val = val*10+value;
            }
            result += val;
        }
        System.out.println(result);
    }
}
