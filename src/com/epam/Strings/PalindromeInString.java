package com.epam.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PalindromeInString {
	
	
	
	public boolean checkInclusion(String s1, String s2) 
	{
		if (s1.length() > s2.length()) {
			return false;
		}
		int[] s1frequency = new int[26];
		int[] s2frequency = new int[26];
		
		for (int i = 0; i < s1.length(); i++) 
		{
			s1frequency[s1.charAt(i)-'a']++;
			s2frequency[s2.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < s2.length()-s1.length(); i++) 
		{
			if (Arrays.equals(s1frequency, s2frequency)) {
				return true;
			}
			s2frequency[s2.charAt(i+s1.length())-'a']++;
			s2frequency[s2.charAt(i)-'a']--;
		}
		
		return false;
    }
	

	public static void main(String[] args) 
	{
		String s1 = "ab", s2 = "eidboaoo";
		PalindromeInString ps = new PalindromeInString();
		System.out.println(ps.checkInclusion(s1, s2));

	}

}
