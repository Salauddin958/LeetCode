package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE12 {

	public static void main(String[] args) 
	{
		int[] array = new int[1001];
		int count=0,k=0;
		for (int i = 1; i <= 1000; i++) 
		{
			while(count <= i)
			{
				k++;
				count = factor((k*(k+1))/2);
			}
			array[i] = (k*(k+1))/2;
		}
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		while(testCases > 0)
		{
			int n = scanner.nextInt();
			System.out.println(array[n]);
			testCases--;
		}
		scanner.close();

	}
	
	static int factor(int n)
	{
		int count=0;
		if (n==1) {
			return 1;
		}
		
		for(int j=1;j < Math.ceil(Math.sqrt(n));j++)
		{
			if (n%j == 0) 
			{
				count += 2;
			}
		}
		
		if (Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))) 
		{
			count++;
		}
		return count;
	}

}
