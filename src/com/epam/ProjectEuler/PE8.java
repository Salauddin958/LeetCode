package com.epam.ProjectEuler;

import java.util.Scanner;

public class PE8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            int answer = 0;
            for (int i = 0; i < n-k+1; i++) 
            {
            	String temp = num.substring(i, i+k);
            	int tempNum = Integer.parseInt(temp);
            	int result=1;
            	while(tempNum > 0)
            	{
            		result = result * (tempNum%10);
            		tempNum = tempNum/10;
            	}
            	answer = Math.max(answer, result);
			}
            System.out.println(answer);
        }
        in.close();
	}

}
