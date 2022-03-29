package com.stack;

import java.util.Stack;

public class PreFix {
    private String output = "";

    public int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public void preFixConversion(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                output = ch+output;
            }
            else if(ch == ')'){
                stack.push(ch);
            }
            else if (ch == '('){
                while(!stack.isEmpty() && stack.peek() != ')'){
                    output = stack.pop()+output;
                }
                if(!stack.isEmpty() && stack.peek() != ')'){
                    System.out.println("Invalid Expression");
                }
                else{
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    output = stack.pop()+output;
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            output = stack.pop()+output;
        }
        System.out.println(output);
    }
}
