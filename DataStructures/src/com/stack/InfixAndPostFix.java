package com.stack;

public class InfixAndPostFix {
    private String output = "";

    public int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public void arithmeticOperations(String input) {
        Stack stack = new Stack();
        for(int i=0;i<input.length();i++){
            char ch =input.charAt(i);
            if( Character.isLetterOrDigit(ch) ){
                output+=ch;
            }
            else if (ch == '('){
                stack.push(ch);
            }
            else if (ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    output+=stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() !='('){
                    System.out.println("Invalid Expression");
                }
                else{
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && precedence(ch) <= precedence((char)stack.peek())){
                    if(stack.peek() == '('){
                        System.out.println("Invalid Expression");
                    }
                    output+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            if(stack.peek() == '('){
                System.out.println("Invalid Expression");
            }
            output+=stack.pop();
        }
        System.out.println(output);
    }
}
