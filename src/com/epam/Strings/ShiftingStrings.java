package com.epam.Strings;

import java.util.Scanner;

public class ShiftingStrings {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		int result = shiftAndCount(s1.trim(),s2.trim());
		System.out.println(result);
		scanner.close();
	}

	private static int shiftAndCount(String s1, String s2) 
	{
		int[] alphaArray = new int[26];
		int[] betaArray  = new int[26];
		String parent = "abcdefghijklmnopqrstuvwxyz";
		int minimumCount = Integer.MAX_VALUE;
		for(int j=0;j<s1.length();j++) {
			int c1 = s1.charAt(j) - 'a';
			int c2 = s2.charAt(j) - 'a';
			if (c1 > c2) {
				String temp = s1;
				s1 = s2;
				s2 = temp;
			}
			for (int i = 0; i < parent.length(); i++) 
			{
				alphaArray[parent.charAt(i)-'a'] = i;
			}
			for (int i = 0; i < s2.length(); i++) 
			{
				betaArray[s2.charAt(i)-'a']++;
			}
			int diff = Math.abs(c1-c2);
			String s1s1 = parent+parent;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s1.length(); i++) 
			{
				int prefix = alphaArray[s1.charAt(i)-'a'];
				sb.append(s1s1.charAt(prefix + diff));
			} 
			String rotated = sb.toString();
			int count = 0;
			int[] gammaArray = new int[26];
			for (int i = 0; i < rotated.length(); i++) 
			{
				gammaArray[rotated.charAt(i)-'a']++;
			}
			for (int i = 0; i < 26; i++) 
			{
					count += Math.abs(gammaArray[i]- betaArray[i]);
			}
			minimumCount = Math.min(minimumCount, count);
			}
		System.out.println();
		return minimumCount;
	}

}
