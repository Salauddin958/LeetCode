package com.epam.Strings;

public class PrintSubSequences {
	
	public static void printSubs(String input)
	{
		printSubs(input,"");
	}
	
	public static void printSubs(String input,String output)
	{
		if (input.length() == 0) 
		{
			System.out.println(output);
			return;
		}
		// remove first char from input and don't include the char in output
		printSubs(input.substring(1), output);
		
		// remove first char from input and include the char in output
		printSubs(input.substring(1), output+input.charAt(0));
	}
	

	public static void main(String[] args) 
	{
		printSubs("xyz");

	}

}
