package com.exam;

import java.util.*;
class Man {
    static double totalSales = 0;
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Item:");
        String itemName = scan.nextLine();
        System.out.println("Enter the price of the item:");
        double price = scan.nextDouble();
        System.out.println("Enter the number of items for sale:");
        int sale = scan.nextInt();
        System.out.println("Enter the number of items sold on Day1:");
        int day1 = scan.nextInt();
        if(sale == day1){
            amountCalculation(itemName,price,sale,day1);
            System.exit(0);
        }
        System.out.println("Enter the number of items sold on Day2:");
        int day2 = scan.nextInt();
        if (sale == day1+day2){
            amountCalculation(itemName,price,sale,day1,day2);
        }
        System.out.println("Enter the number of items sold on Day3");
        int day3 = scan.nextInt();
        if (sale == day1+day2+day3){
            amountCalculation(itemName,price,sale,day1,day2,day3);
        }
        System.out.println("Enter the number of items sold on Day4");
        int day4 = scan.nextInt();
        amountCalculation(itemName,price,sale,day1,day2,day3,day4);
    }
    public static void amountCalculation(String items,double price,int sale,int... a){
        int temp = 0;
        System.out.println(items);
        System.out.println("Day No.of items_available Price");
        int i = 0;
        while(i  <= a.length-1){
            if (i > 0 && i <= 4){
                price = price - ((price*7)/100);
                temp = (int)price;
            }
            i++;
            totalSales =totalSales +(a[i-1]*price);
            if (i == 1){
                System.out.println("Day"+i+" "+(sale)+" "+(int)(price));
            }
            else{
                int previous = a[i-2];
                sale =(sale - previous);
                System.out.println("Day"+i+" "+sale+" "+(int)(temp));
            }
        }
        System.out.printf("Total amount of Sales =Rs.%.0f",totalSales);
    }
}
