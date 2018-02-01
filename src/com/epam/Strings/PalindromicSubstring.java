package com.epam.Strings;

public class PalindromicSubstring {
	
	public int countSubstrings(String s) 
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				String str = s.substring(j, i+1);
				if (isPalindrome(str)) {
					count++;
				}
				
			}
		}
		
		
		return count;
    }
	public boolean isPalindrome(String s)
	{
		for(int i=0;i<s.length()/2;i++)
			if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		return true;
	}

	public static void main(String[] args) 
	{
		PalindromicSubstring ps = new PalindromicSubstring();
		System.out.println(ps.countSubstrings("abc"));

	}

}
