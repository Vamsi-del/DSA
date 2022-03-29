package com.exam;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        System.out.println("Enter First of the Series");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Enter Second Term of the Series");
        int second = scan.nextInt();
        System.out.println("Enter Nth Term");
        int nthTerm = scan.nextInt();
        int difference = Math.abs(first-second);
        System.out.println(nthTerm+ " term is " +first+(nthTerm - 1)*difference);

    }
}
