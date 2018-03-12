package com.epam.Arrays;

public class DeceberryNumber {
	
	
	public static void findSmallest(int sum,int digits)
	{
		if (sum == 0) {
			return;
		}
		if (sum > 9*digits) 
		{
			return;
		}
		int[] result = new int[digits];
		sum = sum - 1;
		
		for(int i=digits-1;i>=0;i--)
		{
			if (sum > 9) 
			{
				sum = sum - 9;
				result[i] = 9;
			}
			else {
				result[i] = sum;
				sum = 0;
			}
		}
		result[0] = sum + 1;
		for (int i = 0; i < digits; i++) {
			System.out.print(result[i]);
		}
	}

	public static void main(String[] args) 
	{
		int s = 9, m = 2;
        findSmallest(s, m);
	}

}
