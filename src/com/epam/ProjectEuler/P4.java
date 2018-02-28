package com.epam.ProjectEuler;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long answer=0;
            for(int i=999;i>=100;i--)
            {
            	for(int j=999;j>=100;j--){
            		long product = i*j;
	            	if ( product < n &&  isPalindrome(product)) 
	            	{
						answer = Math.max(answer, product);
					}
            	}
            }
            System.out.println(answer);
        }
        in.close();
	}
	
	public static boolean isPalindrome(long target)
	{
		long reverse=0;
		long temp = target;
		while(temp > 0)
		{
			reverse = reverse*10+temp%10;
			temp = temp/10;
		}
	
		return target == reverse;
	}

}
