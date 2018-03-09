package com.epam.Strings;

import java.util.Scanner;

public class PowerOf5 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			String input = scanner.next().trim();
			long[] dp = new long[input.length()+1];
			dp[0] = 0;
			
			for(int i=1;i<=input.length();i++)
			{
				dp[i] = Integer.MAX_VALUE;
				for (int j = 1; j <= i; j++) 
				{
					if (input.charAt(j-1)=='0') {
						continue;
					}
					long num = Long.parseLong(input.substring(j-1, i), 2);
					if (isPowerOf5(num)) 
					{
						dp[i] = Math.min(dp[i], dp[j-1]+1);
					}
				}
			}
			System.out.println(dp[input.length()] == Integer.MAX_VALUE ? -1 : dp[input.length()]);
		}
		scanner.close();
	}
	
	public static boolean isPowerOf5(long value)
	{
		if (value == 0) 
		{
			return false;
		}
		int n = (int)(Math.log(value)/Math.log(5));
		return (Math.pow(5, n) == value);
	}

}
