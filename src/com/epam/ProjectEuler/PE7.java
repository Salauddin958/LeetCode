package com.epam.ProjectEuler;

import java.util.ArrayList;
import java.util.Scanner;

public class PE7 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        long t = in.nextLong();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            preCompute();
	            System.out.println(list.get(n-1));
	        }
	        in.close();
	}
	
	static boolean[] primes = new boolean[1000001]; 
	static ArrayList<Integer> list = new ArrayList<>();
	public static void preCompute()
	{
		for(int i=0;i<primes.length;i++)
			primes[i]=true;
		
		primes[0]=primes[1]=false;
		for (int i = 2; i <=1000000; i++) 
		{
			if (primes[i]) 
			{
				for (int j = 2*i; j <=1000000; j+=i) 
				{
					primes[j]=false;
				}
				list.add(i);
			}
		}
	}
}
