package com.Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter two number (press q to terminate)");
        Scanner scan = new Scanner(System.in);
        int power = scan.nextInt();
        int baseNumber = scan.nextInt();
        Power power1 = new Power();
        int result = power1.powerOfNumber(power,baseNumber);
        System.out.println(result);
//        ValueOfTriangle valueOfTriangle = new ValueOfTriangle();
//        Factorial factorial = new Factorial();
//        Fibonacci fibonacci = new Fibonacci();
//        while(true){
//            System.out.println("Enter a Number : ");
//            System.out.flush();
//            int input = getNumber();
//            if (input == 0)
//                break;
//            System.out.println(fibonacci.fibonacciOfNumber(input));
//            System.out.println(factorial.factorialOfNumber(input));
//            System.out.println(valueOfTriangle.triangleNumber(input));
//        }
    }

//    private static int getNumber() throws IOException {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String number = br.readLine();
//        return Integer.parseInt(number);
//    }
}
