package com.exam;

import java.util.Scanner;

public class AngstromNumber {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Enter any Number");
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        for(int i = 0 ;i<number.length();i++){
            double num = 0;
            num = number.charAt(i) - '0';
            result += (int) Math.pow(num,3);
        }
        if (result == Integer.parseInt(number)) {
            System.out.println(number + " is a Angstrom Number");
        } else {
            System.out.println(number + " is Not a Angstrom Number");
        }
    }
}
