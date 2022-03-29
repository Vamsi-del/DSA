package com.stack;

public class StringReversal {
    String output;
    public String reverser(String input) {
//        Stack stack = new Stack();
        OperatorStack operatorStack = new OperatorStack();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            operatorStack.push(ch);
        }
        output="";
        while(!operatorStack.isEmpty()){
            output+=operatorStack.pop();
        }
        return output;
    }
}
