package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE11 {
	
	private static int delta = 4;

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(maxProduct(grid));
        in.close();
	}

	private static long maxProduct(int[][] matrix)
	{
		long max=0;
		
		for(int i=0;i<20;i++)
        {
        	
        	for (int j = 0; j < 20; j++) 
        	{
        		long product = rightProduct(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = downProduct(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = rightDiagonalProduct(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = leftDiagonalProduct(matrix, i, j);
				if (product > max)
				{
					max = product;
				}
			}
        }
		
		return max;
	}
	
	private static long rightProduct(int[][] matrix,int i,int j)
	{
		long product=1;
		if (j <= 20-delta) {
			for (int k = j; k < j+delta; k++) 
			{
				product = product * matrix[i][k];
			}
		}
		return product;
	}
	private static long downProduct(int[][] matrix,int i,int j)
	{
		long product=1;
		if (i <= 20-delta) {
			for (int k = i; k < i+delta; k++) 
			{
				product = product * matrix[k][j];
			}
		}
		return product;
	}
	
	private static long rightDiagonalProduct(int[][] matrix,int i,int j)
	{
		long product=1;
		int s=j;
		if (i <= 20-delta && j <= 20-delta) 
		{
			for (int k = i; k < i+delta; k++) 
			{
				product = product * matrix[k][s++];
			}
		}
		return product;
	}
	
	private static long  leftDiagonalProduct(int[][] matrix,int i,int j) 
	{
		long product=1;
		int s=j;
		
		if (i<= 20-delta && j >= delta-1) 
		{
			for (int k = i; k < i+delta; k++) 
			{
				product = product * matrix[k][s--];
			}
		}
		
		return product;
	}
}
