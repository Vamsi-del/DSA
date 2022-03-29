package com.Recursion;

public class ValueOfTriangle {

    public int triangleNumber(int input) {
        if(input == 1)
            return 1;
        else{
            return input + triangleNumber(input - 1);
        }
    }
}
