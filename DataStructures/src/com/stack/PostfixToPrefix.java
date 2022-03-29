package com.stack;

import java.util.Stack;

public class PostfixToPrefix {
    String output;
    public void postfixToPrefixExpression(String input) {
        Stack<String> stack = new Stack<>();
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                String result = op2+op1;
                output=ch+result;
                stack.push(output);
            }
        }
        System.out.println(stack.pop());
    }
}
