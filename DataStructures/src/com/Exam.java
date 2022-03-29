package com;

import java.util.Scanner;

public class Exam {
    static String[] words;
    public static void main(String[] args) {
        System.out.println("Enter Words");
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                words = new String[num];
                int f = 0;
                while(f<=4){
                    f++;
                    System.out.println(scan.nextLine());
                }
                if(num > 1){
                    for(int j=0;j<num-1;j++){
                        for(int l=j+1;l<num;l++){
                            for(int k=0;k<words[j].length();k++){
                                if(words[j].charAt(k) > words[l].charAt(k)){
                                    String temp = words[j];
                                    words[j] = words[l];
                                    words[l] = words[j];
                                    break;
                                }
                            }
                        }
                    }
                    for(int m=0;m<num;m++){
                        System.out.println(words[m]);
                    }
                }
                else if(num == 1){
                    System.out.println(words[1]);
                }
            }
}
