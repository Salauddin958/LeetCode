package com.epam.ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class PE13 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger result = new BigInteger("0");
		for(int i=0;i<n;i++)
		{
			String temp = scanner.next();
			BigInteger tempVal = new BigInteger(temp);
			result = result.add(tempVal);
		}
		String answer = result.toString();
		System.out.println(answer.substring(0, 10));
		scanner.close();
	}
//2728190129
}
