package com.epam.Graphs;

import java.util.Arrays;
import java.util.Stack;

public class BipartiteCheck {
	
	public static boolean isBipartite(int[][] graph)
	{
		int n = graph.length;
		int[] color = new int[n];
		Arrays.fill(color, -1);
		
		for (int i = 0; i < n; i++) 
		{
			if (color[i] == -1) 
			{
				Stack<Integer> stack = new Stack<>();
				stack.push(i);
				color[i] = 0;
				
				while(!stack.isEmpty())
				{
					Integer node = stack.pop();
					for (int neighbours : graph[node]) 
					{
						if (color[neighbours] == -1) 
						{
							stack.push(neighbours);
							color[neighbours] = color[node] ^ 1;
						}
						else if (color[neighbours] == color[node]) {
							return false;
						}
					}
				}
			}
			
			
		}
		
		
		return true;
	}

	public static void main(String[] args) 
	{
		int[][] graph = {{1,2,3}, {0,2}, {0,1,3}, {0,2}}; 
		System.out.println(isBipartite(graph));
	}

}
