package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE2 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
            long x0 = 1,x1=2;
            long sum=x1;
            long x = 0;
            while(x < n)
            {
            	if (x%2 == 0) {
					sum+=x;
				}
            	x = x0 + x1;
            	x0=x1;
            	x1=x;
            }
            System.out.println(sum);
        }
        in.close();
    }
}
