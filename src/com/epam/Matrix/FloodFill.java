package com.epam.Matrix;

public class FloodFill {

	public static void main(String[] args) 
	{
		int[][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
                		 {1, 1, 1, 1, 1, 1, 0, 0},
                		 {1, 0, 0, 1, 1, 0, 1, 1},
                		 {1, 2, 2, 2, 2, 0, 1, 0},
                		 {1, 1, 1, 2, 2, 0, 1, 0},
                		 {1, 1, 1, 2, 2, 2, 2, 0},
                		 {1, 1, 1, 1, 1, 2, 1, 1},
                		 {1, 1, 1, 1, 1, 2, 2, 1},
               			 };
		int x = 4,y = 4,newC = 3;
		floodFill(screen, x, y, newC);
		
		for (int i=0; i<screen.length; i++)
	    {
	        for (int j=0; j<screen[0].length; j++)
	           System.out.print(screen[i][j]+ " ");
	       System.out.println();
	    }
	}

	static void floodFill(int[][] screen,int x,int y,int newC)
	{
		int prevC = screen[x][y];
		floodFillUti1(screen, x, y, prevC, newC);
	}
	
	static void floodFillUti1(int[][] screen,int x,int y,int prevC,int newC)
	{
		if(x < 0 || y < 0 || x >= screen.length || y >= screen[0].length )
			return;
		if (screen[x][y] != prevC) {
			return;
		}
		
		screen[x][y] = newC;
		
		floodFillUti1(screen, x+1, y, prevC, newC);
		floodFillUti1(screen, x-1, y, prevC, newC);
		floodFillUti1(screen, x, y+1, prevC, newC);
		floodFillUti1(screen, x, y-1, prevC, newC);
	}
	
}
