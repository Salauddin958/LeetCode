package com.epam.ProjectEuler;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long maxFactor = 0;
            while(n%2 == 0)
            {
            	maxFactor = Math.max(maxFactor, 2);
            	n=n/2;
            }
            for (long i = 3; i <= Math.sqrt(n); i+=2) 
            {
            	while(n%i == 0)
            	{
            		maxFactor = Math.max(maxFactor, i);
            		n = n/i;
            	}
			}
            if (n > 2) 
            {
            	maxFactor = Math.max(maxFactor, n);
    		}
            System.out.println(maxFactor);
        }
        
        in.close();

	}

}
