package com.epam.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber 
{
	
	public static String largestNumber(int[] nums) 
	{
		if(nums == null || nums.length == 0)
		    return "";
		
		
		String[] array = new String[nums.length];
		for(int i = 0; i < nums.length; i++)
			array[i] = String.valueOf(nums[i]);
			
		
		Comparator<String> comp = new Comparator<String>(){
		    @Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;
		        String s2 = str2 + str1;
		        return s2.compareTo(s1); 
		    }
	        };
		
		Arrays.sort(array, comp);
        if(array[0].charAt(0) == '0')
             return "0";
            
		StringBuilder sb = new StringBuilder();
		for(String s: array)
	            sb.append(s);
		
		return sb.toString();
    }
	
	
	public static void main(String[] args) {
		int[] nums = {3, 30, 34, 5, 9};
		System.out.println(largestNumber(nums));
	}

}
