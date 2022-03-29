package com.stack;


public class StackSorting {
    private boolean enter = true;

    public void stackSorting(Stack stack) {

        OperatorStack operatorStack = new OperatorStack();
        while(!stack.isEmpty()) {
            if (operatorStack.getSize() == 0) {
                operatorStack.push(stack.pop());
            }
            else {
                if(operatorStack.peek() < stack.peek()){
                    operatorStack.push(stack.pop());
                }
                else{
                        int temp = stack.pop();
                        stack.push(operatorStack.pop());
                        operatorStack.push(temp);
                }
            }
        }
        while(!operatorStack.isEmpty()){
            System.out.print(operatorStack.pop()+" ");
        }
    }
}
