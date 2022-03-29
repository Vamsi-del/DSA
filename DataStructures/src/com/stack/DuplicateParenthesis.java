package com.stack;

import java.util.Stack;

public class DuplicateParenthesis {
    int j=0;
    boolean contains = false;
    public void findDuplicateParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=j;i< input.length();i++){
            char ch  = input.charAt(i);
            if(ch == '(' && input.charAt(i+1) == '('){
                stack.push(ch);
                for(j=i+1;j<input.length();j++){
                    i=j;
                    ch = input.charAt(j);
                    if(ch != ')'){
                        stack.push(ch);
                    }
                    else{
                        while(!stack.isEmpty()){
                            if(stack.peek() != '('){
                                stack.pop();
                                contains = true;
                            }
                            else if(contains){
                                stack.pop();
                                contains = false;
                                break;
                            }
                            else{
                                System.out.println("Expression Contains Duplicate Parenthesis");
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (contains)
            System.out.println("Expression doesn't Contains Duplicate Parenthesis");
    }
}
