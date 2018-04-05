package com.epam.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiffReduction {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) 
		{
			array[i] = scanner.nextInt();
		}
		
		int k = scanner.nextInt();
		
		int mindiff = calculateMinDifference(array,n,k);
		System.out.println(mindiff);
		scanner.close();
	}

	private static int calculateMinDifference(int[] array, int n, int k)
	{
		Arrays.sort(array);
		
		int max = array[n-1];
		int min = array[0];
		
		if(k >= max - min)
		{
			return(max - min);
		}
		
		array[0] = array[0] + k;
		array[n-1] = array[n-1] - k;
		
		int new_max = Math.max(array[0], array[n-1]);
		int new_min = Math.min(array[0], array[n-1]);
		
		for (int i = 1; i < array.length-1; i++) 
		{
			if (array[i] < new_min) 
			{
				array[i] = array[i] + k;
			}
			else if(array[i] > new_max) 
			{
				array[i] = array[i] - k;
			}
			else if((array[i] - new_min) > (new_max - array[i]) )
			{
				array[i] = array[i] - k;
			}
			else 
			{
				array[i] = array[i] + k;
			}
			new_min = Math.min(new_min, array[i]);
			new_max = Math.max(new_max, array[i]);
		}
		
		return (Math.abs(new_max - new_min));
	}

}
