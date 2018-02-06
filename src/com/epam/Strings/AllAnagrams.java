package com.epam.Strings;

import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {
	
	public List<Integer> findAnagrams(String s, String p) 
	{
		
		List<Integer> list = new ArrayList<>();
		
		if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
		int m = s.length(),n=p.length();
		for (int i = 0; i < m-n+1; i++) 
		{
			String sub = s.substring(i, i+n);
			if (isAnagram(sub, p)) {
				list.add(i);
			}
		}
		return list;
    }
	
	public boolean isAnagram(String a,String b)
	{
		if (a == null || a.length() == 0 || b == null || b.length() == 0) return false;
		int[] dict = new int[26];
		
		for (int i = 0; i < a.length(); i++) 
		{
			dict[a.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < b.length(); i++) 
		{
			dict[b.charAt(i)-'a']--;
			if (dict[b.charAt(i)-'a']<0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		AllAnagrams all = new AllAnagrams();
		all.findAnagrams("abab", "ab");

	}

}
