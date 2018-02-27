package com.epam.Strings;

public class CamelCase {
	
	static int camelcase(String s) {
       int count=0;
		for(Character ch : s.toCharArray())
		{
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return (count+1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(camelcase("saveChangesInTheEditor"));
	}

}
