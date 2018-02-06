package com.epam.Arrays;

import java.util.ArrayList;
import java.util.List;

public class DisappearedElements {
	
	public List<Integer> findDisappearedNumbers(int[] nums) 
	{
		 List<Integer> list = new ArrayList<>();
	     for (int i = 0; i < nums.length; i++) 
	     {
	    	 int value = Math.abs(nums[i]) -1;
	    	 if (nums[value]>0) 
	    	 {
	    		 nums[value] = -nums[value];
			 }
	     }
	     for (int i = 0; i < nums.length; i++)
	     {
	    	 if (nums[i]>0) {
				list.add(i+1);
			}
	     }
		
		return list;
    }

	public static void main(String[] args) {
		

	}

}
