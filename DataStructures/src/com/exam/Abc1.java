package com.exam;

import java.util.Scanner;

public class Abc1 {
    public static void main(String[] args) {
        String def = "";
        StringBuilder letter = new StringBuilder();
        System.out.println("Enter the String");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int num = 0;
                while(Character.isDigit(ch)){
                    num = num*10+ ch - '0';
                    i++;
                    if (i<=s.length()-1)
                        ch = s.charAt(i);
                    else
                        break;
                }
                i--;
                for(int j=0;j<num;j++){
                    letter.append(def);
                }
            }
            else{
                def = ""+ch;
            }
        }
        System.out.println(letter);
    }
}
