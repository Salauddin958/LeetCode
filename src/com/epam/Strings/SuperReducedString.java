package com.epam.Strings;

import java.util.Stack;

public class SuperReducedString {
	
	static String super_reduced_string(String s)
	{
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) 
		{
			Character ch = s.charAt(i);
			
			if (!stack.isEmpty() && ch == stack.peek()) {
				stack.pop();
			}
			else {
				stack.push(ch);
			}
		}
		if (stack.isEmpty()) {
			return "Empty String";
		}
		String result="";
		for (Character ch : stack)
		{
			result+=ch;
		}
		return result;
    }

	public static void main(String[] args) {
		
		System.out.println(super_reduced_string("aaabccddd"));
	}

}
