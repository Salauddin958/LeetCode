package com.epam.Matrix;

import java.util.Scanner;

public class SlidingPuzzle {
	
	
	int[][] result = {{1,2,3},{4,5,6},{7,8,9}};
	int k=1;
	int count=0;
	
	public int countSteps(int[][] matrix,SlidingPuzzle slidingPuzzle)
	{
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				
				int requiredValue = result[i][j];
				if (requiredValue==matrix[i][j]) {
					matrix[i][j]=Integer.MIN_VALUE;
				}
				else {
					swapAdjacent(matrix, i, j, result, slidingPuzzle);
				}
			}
		}
		
		return slidingPuzzle.count;
	}
	
	public boolean isPrime(int i)
	{
		if (i<0) {
			return false;
		}
		for (int j = 2; j*j < i; j++) 
		{
			if (i%j==0) {
				return false;
			}
		}
		return true;
	}
	
	public int  swapAdjacent(int[][] matrix,int i,int j,int[][] result,SlidingPuzzle slidingPuzzle)
	{
		if (result[i][j]==matrix[i][j]) {
			matrix[i][j]=Integer.MIN_VALUE;
			result[i][j]=Integer.MIN_VALUE;
			return slidingPuzzle.count;
		}
		if (matrix[i][j]==Integer.MIN_VALUE) {
			return slidingPuzzle.count;
		}
		if ((i>=0 && i<=1 && j>=0 && j<=2) && isPrime(matrix[i][j]+matrix[i+1][j])) 
		{
			int temp = matrix[i][j];
			matrix[i][j]=matrix[i+1][j];
			matrix[i+1][j]=temp;
			slidingPuzzle.count++;
			swapAdjacent(matrix, i+1, j, result, slidingPuzzle);
		}
		if ((i>=0 && i<=2 && j>=0 && j<=1) && isPrime(matrix[i][j]+matrix[i][j+1])) 
		{

			int temp = matrix[i][j];
			matrix[i][j]=matrix[i][j+1];
			matrix[i][j+1]=temp;
			slidingPuzzle.count++;
			swapAdjacent(matrix, i, j+1, result, slidingPuzzle);
		}
		if ((i>=0 && i<=2 && j>=1 && j<=2) && isPrime(matrix[i][j]+matrix[i][j-1])) 
		{
			
			int temp = matrix[i][j];
			matrix[i][j]=matrix[i][j-1];
			matrix[i][j-1]=temp;
			slidingPuzzle.count++;
			swapAdjacent(matrix, i, j-1, result, slidingPuzzle);
		}
		if ((i>=1 && i<=2 && j>=0 && j<=2) && isPrime(matrix[i][j]+matrix[i-1][j])) 
		{
			
			int temp = matrix[i][j];
			matrix[i][j]=matrix[i-1][j];
			matrix[i-1][j]=temp;
			slidingPuzzle.count++;
			swapAdjacent(matrix, i-1, j, result, slidingPuzzle);
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		SlidingPuzzle slidingPuzzle = new SlidingPuzzle();
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[][] matrix = new int[3][3];
		while(t-- >0)
		{
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j]=scanner.nextInt();
				}
			}
			int count =  slidingPuzzle.countSteps(matrix,slidingPuzzle);
			System.out.println(count);
			slidingPuzzle=new SlidingPuzzle();
		}

	}

}
