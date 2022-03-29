package com.stack;


import java.util.Stack;

public class PrefixToInfix {

    public void preFixToInfixExpression(String input) {
        Stack<String>  stack = new Stack<>();
        for(int i=input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else if (isLetter(ch)){
                String temp = "("+stack.pop()+""+ch+""+stack.pop()+")";
                stack.push(temp);
            }
        }
        System.out.println(stack.pop());
    }

    private boolean isLetter(char ch) {
        switch (ch){
            case '+':
            case '*':
            case '/':
            case '-':
                return true;
        }
        return false;
    }
}
