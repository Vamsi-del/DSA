package com.stack;

import java.util.Stack;

public class PrefixToPostfix {
    String output;
    public void prefixToPostfixExpression(String input) {
        Stack<String> stack = new Stack<>();
        for(int i=input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String result = stack.pop()+stack.pop();
                output = result+ch;
                stack.push(output);
            }
        }
        System.out.println(stack.pop());
    }
}
