package com.stack;


public class InfixEvaluation {
    String output="";
    int result;
    char ch;

    public void operations(Stack stack,OperatorStack operatorStack){
        switch (operatorStack.pop()) {
            case '+':
                int op1 = stack.pop();
                int op2 = stack.pop();
                result = op1+op2;
                stack.push(result);
                break;
            case '*':
                op1 = stack.pop();
                op2 = stack.pop();
                result = op1*op2;
                stack.push(result);
                break;
            case '/':
                op1 = stack.pop();
                op2 = stack.pop();
                result = op2/op1;
                stack.push(result);
                break;
            case '-':
                op1 = stack.pop();
                op2 = stack.pop();
                result = op2-op1;
                stack.push(result);
                break;
        }
    }

    public int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

    public void inFixEvaluation(String input) {
        OperatorStack operatorStack = new OperatorStack();
        Stack stack = new Stack();
        for(int i=0;i<input.length();i++){
            ch =input.charAt(i);
            if(Character.isDigit(ch)){
                int num = 0;
                while(Character.isDigit(ch)){
                    num = num*10+(ch-'0');
                    i++;
                    if(i<input.length())
                        ch = input.charAt(i);
                    else
                        break;
                }
                i--;
                stack.push(num);
            }
            else {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence((char)operatorStack.peek())){
                    operations(stack,operatorStack);
                }
                operatorStack.push(ch);
            }
        }
        while (!operatorStack.isEmpty()){
            operations(stack,operatorStack);
        }
        System.out.println(stack.pop());
    }
}
