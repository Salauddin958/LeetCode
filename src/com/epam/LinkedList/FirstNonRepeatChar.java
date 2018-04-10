package com.epam.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatChar {
	
	static int MAX_CHARS = 256;

	public static void main(String[] args) 
	{
		String sample = "geeksforgeeksandgeeksquizfor";

	}
	
	static void printFirstNonRepeat(char[] array)
	{
		boolean[] repeated = new boolean[MAX_CHARS];
		List<Character> list = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) 
		{
			char x = array[i];
			
			if (!repeated[x]) {
				if (!list.contains(x)) {
					list.add(x);
				}
				else {
					list.remove((Character)x);
					repeated[x] = true;
				}
			}
			
			if (list.size() > 0) {
				System.out.println(list.get(0));
			}
		}
	}
}
