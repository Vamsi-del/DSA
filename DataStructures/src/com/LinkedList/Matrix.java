package com.LinkedList;

public class Matrix {
    TwoNodeReference first,temp,real;
    private int number,m,n;
    private int x = 1,y = 1,i;

    public void get(String input) {
        m = Integer.parseInt(input.charAt(input.length()-2)+"");
        n= Integer.parseInt(input.charAt(input.length()-1)+"");
        for(i = 0;i<input.length()-2;i++){
            number = Integer.parseInt(input.charAt(i)+"");
            insert(number);
        }
    }

    private void insert(int number) {
        TwoNodeReference newLink = new TwoNodeReference(number);
        if(first == null){
            first = newLink;
            temp = first;
        }
        else{
            if(x <= m && y <= n){
                TwoNodeReference current = first;
                if (y > 1) {
                    if(temp.down == null && temp.right != null) {
                        temp.down = newLink;
                        real = newLink;
                    }
                    else{
                        while(real.right != null){
                            real = real.right;
                        }
                        real.right = newLink;
                    }
                    temp = temp.right;
                }
                else{
                    while (current.right != null) {
                        current = current.right;
                    }
                    current.right = newLink;
                }
            }
            else{
                i--;
                y++;
                x = 0;
            }
        }
        x++;
    }
}
