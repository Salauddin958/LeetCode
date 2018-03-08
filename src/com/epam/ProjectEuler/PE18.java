package com.epam.ProjectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PE18 {

	 
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++)
		{
			List<List<Long>> rows  = new ArrayList<>();
			int n = scanner.nextInt();
			for(int j = 0; j<n ;j++)
			{
				List<Long> row = new ArrayList<>();
				for(int k = 0; k<j+1;k++)
				{
					row.add(scanner.nextLong());
				}
				rows.add(row);
			}
			
			for(int j = rows.size()-2;j>=0;j--)
			{
				List<Long> temp = new ArrayList<>();
				
				for(int k=0;k< rows.get(j).size();k++)
				{
					List<Long> upperRow = rows.get(j);
					List<Long> bottomRow = rows.get(j+1);
					
					long leftSum = upperRow.get(k) + bottomRow.get(k);
					long rightSum = upperRow.get(k) + bottomRow.get(k+1);
					long maxSum = leftSum > rightSum ? leftSum : rightSum;
					temp.add(maxSum);
				}
				rows.remove(j+1);
				rows.set(j, temp);
			}
			System.out.println(rows.get(0).get(0));
		}
		scanner.close();
	}
}
