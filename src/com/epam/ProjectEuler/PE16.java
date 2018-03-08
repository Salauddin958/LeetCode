package com.epam.ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class PE16 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = scanner.nextInt();
			BigInteger base = new BigInteger("2");
		    BigInteger power = base.pow(n);
			String str = power.toString();
			int sum = 0;
			for (int j = 0; j < str.length(); j++) 
			{
				sum = sum + Character.getNumericValue(str.charAt(j));
			}
			System.out.println(sum);
		}
		scanner.close();
	}
	
}
