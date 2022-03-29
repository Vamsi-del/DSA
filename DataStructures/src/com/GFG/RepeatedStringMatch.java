package com.GFG;

import java.util.Scanner;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (b.length() < 1){
            System.out.println("-1");
        }
        else if (a.length() > b.length()){
            System.out.println("1");
        }
        else{
            int i = 1;
            String cp = a;
            while (a.length() < b.length()){
                i++;
                a=a+cp;
            }
            System.out.println(i);
        }
    }
}
