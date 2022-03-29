package com.stack;

public class PostfixEvaluation {

    public void postFixEvaluation(String input){
        Stack stack = new Stack();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (Character.isDigit(ch)){
                stack.push(Integer.parseInt(ch+""));
            }
            else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op2 - op1);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op2 / op1);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}
