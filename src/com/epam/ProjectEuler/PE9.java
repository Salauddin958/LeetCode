package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE9 {

	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int[] array  = new int[n+1];
	            for (int i = 0; i <=n; i++) 
	            {
	            	array[i] = i;
				}
	            
	            long maxProduct = 1;
	            /*if (n%2 == 0) {
	            	for(int a = 1;a <= n/3;a++)
		            {
		            	int Sa = a*a;
		            	for(int b = a+1 ; b<=n/2; b++)
		            	{
		            		int c = n - a - b;
		            		int Sb = b * b;
		            		if ( c > 0 && c*c == Sa + Sb) 
		            		{
		            			long product = (long)a*b*c;
		            			maxProduct = Math.max(maxProduct, product);
							}
		            	}
		            }
				}
	            */
	            if (n%2 == 0) { 
		            for(int b = 1;b< n/2;b++)
		            {
		            	if (n * (n/2 - b) % (n - b) == 0) 
		            	{
		            		int a = n * (n/2 - b) / (n - b);
		            		int c = n - a - b;
		            		int Sb = b * b;
		            		int Sa = a*a;
		            		if ( c > 0 && c*c == Sa + Sb) 
		            		{
		            			long product = (long)a*b*c;
		            			maxProduct = Math.max(maxProduct, product);
							}
						}
		            }
	            }
	            if (maxProduct == 1) 
	            {
					maxProduct = -1;
				}
	            System.out.println(maxProduct);
	        }
	        in.close();
	}

}
