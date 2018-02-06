package com.epam.Arrays;

public class JudgeCircle {
	
	public static boolean judgeCircle(String moves) 
    {
		if (moves == null || moves.length()==0) {
			return true;
		}
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < moves.length(); i++) 
		{
			if (moves.charAt(i) == 'R') {
				x++;
			}
			else if (moves.charAt(i) == 'L') {
				x--;
			}
			else if (moves.charAt(i) == 'U') {
				y++;
			}
			else if (moves.charAt(i) == 'D') {
				y--;
			}
		}
		if (x == 0 && y == 0) 
		{
			return true;
		}	
		return false;
    }
	
	public static void main(String[] args) 
	{
		String moves = "LL";
		System.out.println(judgeCircle(moves));

	}

}
