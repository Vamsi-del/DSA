package com.exam;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int feet = scan.nextInt();
        double power = feet/3;
        int number = 2;
        int i = 1;
        int temp = 0;
        while(temp != power){
            if (temp > power){
                System.out.println("Sorry");
            }
            i++;
            temp =(int) Math.pow(number,i);
        }
        System.out.println(i);
        int value = 3;
        int j = 0;
        while(value != feet){
            if(value > feet){
                System.out.print("Sorry");
                System.exit(0);
            }
            value = value * 2;
            j++;
        }
        System.out.println(j);
    }
}
