package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE6 {

	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
	        long t = in.nextLong();
	        for(int a0 = 0; a0 < t; a0++){
	            long n = in.nextLong();
	            
	            long first = n * (n+1)/2;
	            long squareOfFirst = first * first;
	            
	            long sumOfSquares = (n*(n+1)*(2*n+1))/6;
	            long answer = squareOfFirst - sumOfSquares;
	            System.out.println(answer);
	        }
	        in.close();
	}

}
