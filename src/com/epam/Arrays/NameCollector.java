package com.epam.Arrays;

import java.util.Scanner;

public class NameCollector {
	
	public static void numberOfSwitches(String[] names,int n,String[] labels)
	{
		int count=0;
		if (n==0) {
			System.out.println(0);
			return ;
		}
		int m = labels.length;
		int i=0,j=0;
		
		while(i<n)
		{
			
			if(!names[i].equals(labels[j]))
			{
				System.out.println("@"+names[i]+" : "+count);
				i++;
			}
			else
			{
				
				j++;
				count++;
				if (j == m) 
				{
					j=0;
				}
			}
		}
		
		
	}

	public static void main(String[] args) 
	{
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		while(testCases-- > 0)
		{
			int boxes = scanner.nextInt();
			String[] labels = new String[boxes];
			for (int i = 0; i < labels.length; i++) 
			{
				labels[i] = scanner.next().trim();
			}
			int n = scanner.nextInt();
			String[] names = new String[n];
			
			for (int i = 0; i < names.length; i++) 
			{
				names[i] = scanner.next();
			}
			numberOfSwitches(names, n, labels);
		}

	}

}
