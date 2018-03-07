package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE15 {
	
	static long modulo = 1_000_000_007; 
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++)
		{
			int m = scanner.nextInt()+1;
			int n = scanner.nextInt()+1;
			long[][] matrix = new long[m][n];
			matrix[0][0] = 0;
			for(int j=1;j<m;j++)
			{
				matrix[j][0] = 1 ;
			}
			for(int j=1;j<n;j++)
			{
				matrix[0][j] = 1 ;
			}
			
			for (int j = 1; j < m; j++) 
			{
				for (int k = 1; k < n; k++) 
				{
					matrix[j][k] = ((matrix[j-1][k] % modulo) + (matrix[j][k-1] % modulo)) % modulo;
				}
			}
			System.out.println(matrix[m-1][n-1]);
		}
		
		scanner.close();
	}

}
