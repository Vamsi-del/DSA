package com.scanner;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UserInput {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter noOf Students ");
//        String s = scanner.nextLine();
//        StringTokenizer token = new StringTokenizer(s);
        while(true){
            System.out.println(scanner.next());
//            scanner.next();
            if(!scanner.hasNext()){
                break;
            }
        }
//        int noOfStudents = scanner.nextInt();
//        int[] marks = new int[noOfStudents];
//        String[] students = new String[noOfStudents];
//        System.out.println("Enter Students Marks ");
//        students[0] = scanner.nextLine();
//        for (int i=0;i<marks.length;i++){
//            students[i] = scanner.nextLine();
//            marks[i] = scanner.nextInt();
//            students[i] = scanner.next();
//        }
//        System.out.println("Students Names are ");
//        for(int i=0;i<marks.length;i++){
//            System.out.println(i+" "+marks[i]);
//        }
    }
}
