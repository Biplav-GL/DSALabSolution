package com.gl.questionOne;
import java.util.Stack;

public class BalancingBrackets {

    public static boolean checkIfClosingBrackets(Stack<?> stack, char current_input){
        if (stack.peek().equals('{') && current_input == '}') {
            return true;
        } else if (stack.peek().equals('[') && current_input == ']'){
            return true;
        } else return stack.peek().equals('(') && current_input == ')';
    }

    public static void main(String[] args) {

        //Enter the Brackets input in a String Expression
        String expressions = "([[{}]])"; //Balanced Input
//        String expressions = "([[{}]]))"; //UnBalanced Input

        //Creating a Stack to Store the Brackets as Character
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expressions.length(); i++) {
            if (stack.isEmpty()){
                stack.push(expressions.charAt(i));
            } else if(checkIfClosingBrackets(stack, expressions.charAt(i))) {
                stack.pop();
            } else {
                stack.push(expressions.charAt(i));
            }
        }

        if(stack.isEmpty()){
            System.out.println("The entered String has Balanced Brackets");
        }else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
