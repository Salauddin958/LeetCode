package com.epam.Strings;

import java.util.HashMap;

public class EquilibriumString 
{
	
	public int EqString(String target)
	{
		int  maxlen = 0;
		for (int i = 0; i < target.length(); i++) 
		{
			for (int j = i+1; j <=target.length(); j++) 
			{
				String temp = target.substring(i, j);
//				System.out.println(temp);
				if (areEqual(temp)) 
				{
					maxlen = Math.max(maxlen, temp.length());
				}
			}
		}
		
		return maxlen;
	}
	
	public boolean areEqual(String str)
	{
		int count=0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == '0') 
			{
				count++;
			}
			else if (str.charAt(i) == '1') {
				count--;
			}
		}
		
		return (count == 0);
	}
	
	// optimized
	
	public int maxEquiString(String target)
	{
		int result = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int c1 =0,c0=0;
		
		for (int i = 0; i < target.length(); i++) 
		{
			if (target.charAt(i)=='0') {
				c0++;
			}
			else {
				c1++;
			}
			
			if (map.containsKey(c1-c0)) 
			{
				result = Math.max(result, i-map.get(c1-c0));
			}
			else {
				map.put(c1-c0, i);
			}
		}
		return result; 
	}
	
	public static void main(String[] args) 
	{
		String target = "110101010";
		EquilibriumString es = new EquilibriumString();
		System.out.println(es.maxEquiString(target));

	}

}
