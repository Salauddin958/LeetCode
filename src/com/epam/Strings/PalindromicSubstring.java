package com.epam.Strings;

public class PalindromicSubstring {
	
	// alternate solution from https://leetcode.com/articles/palindromic-substrings/
	
	public int count(String s)
	{
		int n = s.length();
		int count = 2*n -1;
		int answer=0;
		for(int center =0;center<=count;center++)
		{
			int left = center/2;
			int right = center%2 +left;
			
			while(left >= 0 && right<n && s.charAt(left)==s.charAt(right))
			{
				answer++;
				left--;
				right++;
			}
		}
		
		return answer;
	}
	
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
		System.out.println(ps.count("abc"));

	}

}
