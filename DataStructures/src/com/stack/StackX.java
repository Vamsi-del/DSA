package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackX {
    public static void main(String[] args) throws Exception {
//        Stack stack = new Stack();
//        stack.push(8);
//        stack.push(10);
//        stack.push(9);
//        stack.push(2);
//        stack.push(0);
//        stack.push(1);
//        StackSorting sorting = new StackSorting();
//        sorting.stackSorting(stack);
        while(true){
            StackX stackX = new StackX();
            System.out.println("Enter Your String : ");
            System.out.flush();
            String input = stackX.string();
            if(input.isEmpty()){
                break;
            }
//            StringReversal stringReversal = new StringReversal();
//            System.out.println(stringReversal.reverser(input)+" ");
//            Delimiters delimiters = new Delimiters();
//            delimiters.find(input);
            InfixAndPostFix infixAndPostFix = new InfixAndPostFix();
            infixAndPostFix.arithmeticOperations(input);
//            PostfixEvaluation postfixEvaluation = new PostfixEvaluation();
//            postfixEvaluation.postFixEvaluation(input);
//            PreFix preFix = new PreFix();
//            preFix.preFixConversion(input);
//            InfixEvaluation infixEvaluation = new InfixEvaluation();
//            infixEvaluation.inFixEvaluation(input);
//            PrefixEvaluation prefixEvaluation = new PrefixEvaluation();
//            prefixEvaluation.prefixExpressionEvaluation(input);
//            PrefixToInfix prefixToInfix = new PrefixToInfix();
//            prefixToInfix.preFixToInfixExpression(input);
//            PostfixToPrefix postfixToPrefix = new PostfixToPrefix();
//            postfixToPrefix.postfixToPrefixExpression(input);
//            PrefixToPostfix prefixToPostfix = new PrefixToPostfix();
//            prefixToPostfix.prefixToPostfixExpression(input);
//            DuplicateParenthesis duplicateParenthesis = new DuplicateParenthesis();
//            duplicateParenthesis.findDuplicateParenthesis(input);
        }
    }
    public String string(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
//        DynamicStackArray dynamicStackArray = new DynamicStackArray(4,-1);
//        dynamicStackArray.push(8);
//        dynamicStackArray.push(5);
//        dynamicStackArray.push(6);
//        dynamicStackArray.push(7);
//        dynamicStackArray.push(8);
//        while(!dynamicStackArray.isEmpty()){
//            System.out.print(dynamicStackArray.pop()+" ");
//        }
//        System.out.println(dynamicStackArray.dynamicArray.length);
//        System.out.println(dynamicStackArray.size());
//        LinkedListStack linkedListStack = new LinkedListStack();
//        linkedListStack.push(20);
//        linkedListStack.push(40);
//        linkedListStack.push(60);
//        linkedListStack.push(80);
//        linkedListStack.pop();
//        linkedListStack.pop();
//        linkedListStack.display();
//        while(!linkedListStack.isEmpty()){
//            linkedListStack.pop();
//        }
//        linkedListStack.display();

//        CircularStack circularStack = new CircularStack();
//        circularStack.push(10);
//        circularStack.push(20);
//        circularStack.push(30);
//        circularStack.push(40);
//        circularStack.pop();
//        circularStack.display();
//        circularStack.isEmpty();
}
