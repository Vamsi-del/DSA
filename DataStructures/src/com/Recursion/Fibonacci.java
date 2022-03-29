package com.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci {
    private int count =0;
    public int fibonacciOfNumber(int input) {
        if(input <=  1){
            return input;
        }
        else{
            if(input == 2)
                ++count;
            int fib = fibonacciOfNumber(input - 1) + fibonacciOfNumber(input - 2);
            return count;
        }
    }
}
