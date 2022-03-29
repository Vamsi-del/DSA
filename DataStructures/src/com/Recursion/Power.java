package com.Recursion;

public class Power {
    public int powerOfNumber(int power, int baseNumber) {
        if(power == 1)
            return baseNumber;
        return baseNumber*powerOfNumber(power-1,baseNumber);
    }
}
