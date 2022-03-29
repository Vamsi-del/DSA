package com.exam;

import java.util.Scanner;

public class NthDigit {
    public static void main(String[] args) {
        System.out.println("Enter the Digit");
        Scanner scan = new Scanner(System.in);
        int baseNumber = scan.nextInt();
        System.out.println("Enter Power Digit");
        int powerNumber = scan.nextInt();
        System.out.println("Enter Nth Digit");
        int nthNumber = scan.nextInt();
        int result =(int)Math.pow(baseNumber,powerNumber);
        System.out.println(result);
        String result1 = ""+result;
        System.out.println("The Nth Digit from right of the number is : "+result1.charAt(result1.length() - nthNumber));
    }
}
