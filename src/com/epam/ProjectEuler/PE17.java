package com.epam.ProjectEuler;

import java.util.HashMap;
import java.util.Scanner;

public class PE17 {
	
	private static HashMap<Integer, String> map = new HashMap<>();
	private static HashMap<Integer, String> secondMap = new HashMap<>();
	public static void main(String[] args) 
	{
		preCompute();
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) 
		{
			long number = scanner.nextLong();
			StringBuilder hundreds = new StringBuilder("");
			StringBuilder thousands = new StringBuilder("");
			StringBuilder millions = new StringBuilder("");
			StringBuilder billions = new StringBuilder("");
			while(number > 0)
			{
				if (hundreds.length() < 3 ) 
				{
					hundreds.append(number%10);
				}
				else if (thousands.length() < 3) 
				{
					thousands.append(number%10);
				}
				else if (millions.length() < 3) 
				{
					millions.append(number%10);
				}
				else if (billions.length() < 3) 
				{
					billions.append(number%10);
				}
				number = number/10;
			}
			StringBuilder result = new StringBuilder();
			if (billions != null && !billions.equals("") && !billions.toString().isEmpty()) 
			{
				result = buildWord(billions, result);
				result.append("Billion"+" ");
			}
			if (millions != null && !millions.equals("") && !millions.toString().isEmpty()) 
			{
				result = buildWord(millions, result);
				result.append("Million"+" ");
			}
			if (thousands != null && !thousands.equals("")&& !thousands.toString().isEmpty()) 
			{
				result = buildWord(thousands, result);
				result.append("Thousand"+" ");
			}
			if (hundreds != null && !hundreds.equals("")&& !hundreds.toString().isEmpty()) 
			{
				result = buildWord(hundreds, result);
			}
			System.out.println(result.toString());
		}
		scanner.close();
	}
	
	public static StringBuilder buildWord(StringBuilder word,StringBuilder result)
	{
		word = word.reverse();
		int bill = Integer.parseInt(word.toString());
		if (bill >= 100) 
		{
			result.append(map.get(bill/100)+" " + "Hundred");
			bill = bill%100;
		}
		
		if (bill >=0 && bill <=19) 
		{
			result.append(map.get(bill)+" ");
		}
		else {
			result.append(secondMap.get(bill/10)+" ");
			result.append(map.get(bill%10)+" ");
		}
		
		return result;
	}
	
	private static void preCompute()
	{
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(0, "");
		
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(12, "Twelve");
		map.put(13, "Thirteen");
		map.put(14, "Fourteen");
		map.put(15, "Fifteen");
		map.put(16, "Sixteen");
		map.put(17, "Seventeen");
		map.put(18, "Eighteen");
		map.put(19, "Nineteen");
		
		secondMap.put(2, "Twenty");
		secondMap.put(3, "Thirty");
		secondMap.put(4, "Forty");
		secondMap.put(5, "Fifty");
		secondMap.put(6, "Sixty");
		secondMap.put(7, "Seventy");
		secondMap.put(8, "Eighty");
		secondMap.put(9, "Ninety");
		
	}
}
