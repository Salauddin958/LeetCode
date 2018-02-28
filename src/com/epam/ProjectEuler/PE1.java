package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE1 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum=0;
            long multiples_5 = 5*((n-1)/5 *((n-1)/5 + 1)/2); 
            long multiples_3 = 3*((n-1)/3 *((n-1)/3 + 1)/2);
            long multiples_15 = 15*((n-1)/15 *((n-1)/15 + 1)/2);
            sum = multiples_3 + multiples_5 - multiples_15;
            System.out.println(sum);
        }
        
	}

}
