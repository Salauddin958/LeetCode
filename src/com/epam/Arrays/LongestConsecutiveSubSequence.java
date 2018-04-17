package com.epam.Arrays;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LongestConsecutiveSubSequence {
	
	static int longestSubSequence(int[] array,int n)
	{
		int max = Integer.MIN_VALUE; 
		Set<Integer> set = ConcurrentHashMap.newKeySet();

		
		for (int i = 0; i < array.length; i++) 
		{
			set.add(array[i]);
			
		}
		
		for(Object i : set)
		{
			int left = (Integer)i-1;
			int right = (Integer)i+1;
			int count = 1;
			
			while(set.contains(left))
			{
				count++;
				set.remove(left);
				left--;
			}
			while(set.contains(right))
			{
				count++;
				set.remove(right);
				right++;
			}
			max = Math.max(max, count);
		}
		
		return max;
	}

	public static void main(String[] args) 
	{
		int[] array = {1, 9, 3, 10, 4, 20, 2};
//			{36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};//
		System.out.println(longestSubSequence(array, array.length));

	}

}
