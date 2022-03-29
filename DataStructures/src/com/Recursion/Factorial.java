package com.Recursion;

public class Factorial {

    public long factorialOfNumber(int input) {
        if(input == 0)
            return 1;
        else{
            long temp = input * factorialOfNumber(input - 1);
//            System.out.print("Factorial("+input+") : " + temp);
//             System.out.println(input);
             print(input);
             return temp;
        }
    }

    private void print(int input) {
        System.out.println(input);
    }
}
