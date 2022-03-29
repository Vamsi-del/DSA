package com.exam;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        System.out.println("Enter First term of the Series");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Enter Common ration of the Series");
        int second = scan.nextInt();
        System.out.println("Enter Nth Term");
        int nthTerm = scan.nextInt();
        int save = power(second,nthTerm-1);
        System.out.println(nthTerm+" term is "+first*save);
    }

    private static int power(int second, int nthTerm) {
        if(nthTerm == 0)
            return 1;
        return second*power(second,nthTerm-1);
    }
}
