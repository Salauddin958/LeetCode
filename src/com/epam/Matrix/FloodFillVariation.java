package com.epam.Matrix;

public class FloodFillVariation {

	public static void main(String[] args) 
	{
		int N = 6;
		char[][] matrix =  {{'X', 'O', 'X', 'O', 'X', 'X'},
                			{'X', 'O', 'X', 'X', 'O', 'X'},
                			{'X', 'X', 'X', 'O', 'X', 'X'},
                			{'O', 'X', 'X', 'X', 'X', 'X'},
                			{'X', 'X', 'X', 'O', 'X', 'O'},
                			{'O', 'O', 'X', 'O', 'O', 'O'},
               			   };
		replaceSurrounded(matrix, N);
		for (int i=0; i<N; i++){
		      for (int j=0; j<N; j++)
		      {
		    	  System.out.print(matrix[i][j]+" ");
		      }
		      System.out.println();
		}
	}
	
	static void replaceSurrounded(char[][] matrix,int N)
	{
		for(int i=0;i<N;i++)
		{
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 'O') {
					matrix[i][j] = '-';
				}
			}
		}
		
		for(int i=0;i<N;i++)
		{
			if (matrix[i][0] == '-') {
				floodFill(matrix, i, 0, '-', 'O', N);
			}
		}
		for(int i=0;i<N;i++)
		{
			if (matrix[i][N-1] == '-') {
				floodFill(matrix, i, N-1, '-', 'O', N);
			}
		}
		for(int i=0;i < N;i++)
		{
			if (matrix[0][i] == '-') {
				floodFill(matrix, 0, i, '-', 'O', N);
			}
		}
		for(int i=0;i<N;i++)
		{
			if (matrix[N-1][i] == '-') {
				floodFill(matrix, N-1, i, '-', 'O', N);
			}
		}
		
		for (int i=0; i<N; i++)
		      for (int j=0; j<N; j++)
		         if (matrix[i][j] == '-')
		             matrix[i][j] = 'X';
	}
	
	static void floodFill(char[][] matrix,int x,int y,char prev,char curr,int N)
	{
		if (x < 0 || y < 0 || x >=N || y >= N) {
			return;
		}
		if (matrix[x][y] != prev) {
			return;
		}
		matrix[x][y] = curr;
		floodFill(matrix, x+1, y, prev, curr, N);
		floodFill(matrix, x-1, y, prev, curr, N);
		floodFill(matrix, x, y+1, prev, curr, N);
		floodFill(matrix, x, y+1, prev, curr, N);
		
		
	}
}
