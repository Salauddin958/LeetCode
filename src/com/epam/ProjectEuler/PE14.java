package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE14 {
	
	private static final int N = 5_000_000;
	private static long[] seqValue = new long[N];
	private static long[] seqIndex = new long[N];

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int t  = scanner.nextInt();
		for (int i = 0; i < t; i++) 
		{
			int n = scanner.nextInt(); 
			preCompute();
			System.out.println(seqIndex[n]);
		}
		scanner.close();
	}
	
	
	
	private static void preCompute()
	{
		seqIndex[0] = 1;
		seqIndex[1] = 1;
		
		seqValue[0] = 1;
		seqValue[1] = 1;
		
		int maxValue = 0;
		int maxIndex = 0;
		
		for(int j=2;j<N;j++)
		{
			int seq = 0;
			long number = j;
			
			while(number > 1)
			{
				if (seqValue[j] > 0) 
				{
					seq+=seqValue[j];
					break;
				}
				seq++;
				if (number % 2 == 0) 
				{
					number = number >> 1;
				}
				else 
				{
					number = number * 3 + 1;
				}
			}
			seqValue[j] = seq;
			if (seq >= maxValue) 
			{
				maxValue = seq;
				maxIndex = j;
			}
			seqIndex[j] = maxIndex;
		}
	}
	
}
