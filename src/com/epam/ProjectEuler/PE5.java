package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            long lcm = 1;
            for(int i=1;i<=n;i++)
            {
            	lcm = (i*lcm)/gcd(i, lcm);
            }
            System.out.println(lcm);
        }
        
        in.close();

	}
	
	public static long gcd(long a,long b)
	{
		if (b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
