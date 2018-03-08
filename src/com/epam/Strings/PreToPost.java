package com.epam.Strings;

import java.util.Stack;

public class PreToPost 

{
	private static String pre2post(String prefixExp) {

        final String LEFT_DONE = "LEFT_DONE";

        Stack<String> operatorStack = new Stack<>();
        StringBuilder strPostfix = new StringBuilder();

        if (prefixExp.trim().isEmpty()) {
            return null;
        }

        char[] chars = prefixExp.toCharArray();

        for (char aChar : chars) {

            if (isOperator(aChar)) {
                operatorStack.push(String.valueOf(aChar));
            } else {
                strPostfix.append(String.valueOf(aChar));
                while (!operatorStack.empty() && operatorStack.peek().equals(LEFT_DONE)) {
                    operatorStack.pop();
                    strPostfix.append(operatorStack.pop());
                }
                operatorStack.push(LEFT_DONE);
            }
        }

        return strPostfix.toString();
    }
	
	 private static boolean isOperator(char c) {
	        char[] operators = {'+', '-', '/', '*'};
	        boolean isOp = false;
	        for (char operator : operators) {
	            if (c == operator) {
	                isOp = true;
	                break;
	            }
	        }
	        return isOp;
	    }
}
