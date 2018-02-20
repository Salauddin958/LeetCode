package com.epam.Graphs;

public class MaxArea {
	
	public int maxAreaOfIsland(int[][] grid) 
	{
		if (grid == null || grid.length == 0) {
			return 0;
		}
		
		int m = grid.length;
		int n = grid[0].length;
		int maxArea = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int area = dfs(grid,m,n,i,j,0);
					maxArea = Math.max(maxArea, area);
				}
			}
		}
		
		return maxArea;
    }

	private int dfs(int[][] grid, int m, int n, int i, int j, int area) 
	{
		if (i<0 || i>=m || j<0 || j>=n || grid[i][j]==0) {
			return area;
		}
		grid[i][j] = 0;
		area++;
		
		area = dfs(grid, m, n, i+1, j, area);
		area = dfs(grid, m, n, i, j+1, area);
		area =  dfs(grid, m, n, i-1, j, area);
		area  = dfs(grid, m, n, i, j-1, area);
	
		return area;
	}

	public static void main(String[] args) {
		

	}

}
