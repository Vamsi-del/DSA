package com.stack;

public class Delimiters {

    public void find(String input) {
        Stack stack = new Stack();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stack.isEmpty()){
                        char ch1 = (char) stack.pop();
                        if(ch1 == '{' && ch != '}'|| ch1 == '['  &&  ch != ']'|| ch1 == '(' && ch != ')'){
                            System.out.println("Delimiter  "+ ch +"  missing at index  "+i );
                        }
                        else{
                            System.out.println("Delimiter  "+ ch +"  missing at index  "+i );
                        }
                    }
                default:
                    break;
                }
            }
        if(! stack.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }
        }
    }
