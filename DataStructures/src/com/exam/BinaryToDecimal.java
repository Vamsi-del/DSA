package com.exam;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Enter Binary Number which is to be converted");
        Scanner scan = new Scanner(System.in);
        String binary = scan.nextLine();
//        System.out.println(Integer.parseInt(binary,2));  ---> Method 1
        for(int i = binary.length()-1;i>=0;i--){
            int number = Integer.parseInt(""+binary.charAt(i));
            result += number * Math.pow(2,binary.length()-1-i);
        }
        System.out.println(result);
    }
}
