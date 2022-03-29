package com.exam;

import java.util.Scanner;

public class ClosetNumber {
    static boolean another = true;
    public static void main(String[] args) {
        while (another) {
            System.out.println("Enter the Nearest Number");
            Scanner scan = new Scanner(System.in);
            int nearest = scan.nextInt();
            System.out.println("Enter the divide Number");
            int divisible = scan.nextInt();
            int qua = nearest / divisible;
            int n1 = divisible * qua;
            int n2 = (qua > 0) ? divisible * (qua + 1) : divisible * (qua - 1);
            if(Math.abs(n1 - n2) < Math.abs(n2 - n1))
                System.out.println(n1);
            System.out.println(n2);
            System.out.println("Do you want to try again if yes type Y or N");
            another = scan.next().equalsIgnoreCase("Y");
        }
    }
}
