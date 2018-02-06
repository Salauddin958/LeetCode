package com.epam.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	
	public List<Integer> findDuplicates(int[] nums) 
	{
		
		List<Integer> list = new ArrayList<>();
		if (nums.length ==1 || nums.length==0) 
		{
			return list;
		}
		int n=nums.length;
		for (int i = 0; i < nums.length; i++) 
		{
			nums[(nums[i]-1)%n]+=n;
		}
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]>2*n) {
				list.add(i+1);
			}
		}
		
		return list;
    }

	public static void main(String[] args) {
		

	}

}
