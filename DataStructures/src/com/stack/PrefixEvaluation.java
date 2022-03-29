package com.stack;

public class PrefixEvaluation {
    private String output,num1;

    public void prefixExpressionEvaluation(String input) {
        Stack stack = new Stack();
        StringReversal stringReversal = new StringReversal();
        for(int i=input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                num1 = "";
                while(Character.isDigit(ch)){
                    num1 += (ch-'0');
                    i--;
                    if (i>=0)
                        ch = input.charAt(i);
                    else
                        break;
                }
                i++;
                stack.push(Integer.parseInt(stringReversal.reverser(num1)));
            }
            else if (ch+"" == " "){
                i--;
            }
            else{
                switch (ch){
                    case '+':
                        int result = stack.pop()+stack.pop();
                        stack.push(result);
                        break;
                    case '*':
                        result = stack.pop()*stack.pop();
                        stack.push(result);
                        break;
                    case '/':
                        result = stack.pop()/stack.pop();
                        stack.push(result);
                        break;
                    case '-':
                        result = stack.pop()-stack.pop();
                        stack.push(result);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}
