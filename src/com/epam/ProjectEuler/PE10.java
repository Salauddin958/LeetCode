package com.epam.ProjectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PE10 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Long> primes = eratosthenes(1000000);
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(sum(primes, n));
            /*long sum=0;
            int[] primes = new int[1000001];
            for(int i=2;i<=1000000;i++)
            {
            	if (primes[i]==0) 
            	{
            		for(int j=2*i;j<=1000000;j+=i)
            			primes[j] = 1;
				}
            }
            
            while(n > 1)
            {
            	if (primes[n]==0) 
            	{
            		sum+=n;
				}
            	n--;
            }
            
            System.out.println(sum);*/
        }
        in.close();
	}
	
	private static long sum(List<Long> primes, int n)
	{
		long sum = 0;
		for (long prime : primes)
		{
			if(Long.compare(prime, n) > 0)
			{
				return sum;
			}
			sum += prime;
		}
		return sum;
	}
	private static List<Long> eratosthenes(int number)
	{
		boolean[] array = new boolean[number + 1];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = true;
		}
		for (int i = 2; i < array.length; i++)
		{
			if(array[i])
			{
				int j = i;
				while ((long) j * i < array.length)
				{
					array[j * i] = false;
					j++;
				}
			}
		}
		List<Long> primes = new ArrayList<Long>();
		for (int i = 2; i < array.length; i++)
		{
			if(array[i])
			{
				primes.add((long) i);
			}
		}
		return primes;
	}
	
}
