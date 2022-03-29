package com.exam;

import java.util.Arrays;

public class ClosetPair {
    public static void main(String[] args) {
        int[] array = {3,1,6,8,10,13,18,-1,-1};
        Arrays.sort(array);
        int SmallestDistance = Math.abs(array[0] - array[1]);
        for(int j=1;j<= array.length-2;j++){
            int dummy = Math.abs(array[j] - array[j+1]);
            if (SmallestDistance > dummy){
                SmallestDistance = dummy;
            }
        }
        System.out.println(SmallestDistance);
    }
}
