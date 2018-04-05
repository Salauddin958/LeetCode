package com.epam.Arrays;

import java.util.Arrays;

public class AggressiveCows {
	
	static boolean possibleDistance(int mid,int[] positions,int limit)
	{
		int cowsPlaced = 1,lastPosition = positions[0];
		
		for (int i = 1; i < positions.length; i++) 
		{
			if(positions[i] - lastPosition >= mid)
			{
				if (++cowsPlaced == limit) {
					return true;
				}
				lastPosition = positions[i];
			}
		}
		
		return false;
	}

	public static void main(String[] args) 
	{
		int[] array = {1,4,8,2,9};
		Arrays.sort(array);
		int n = array.length;
		int start=0,end = array[n-1]-array[0]+1,mid;
		
		while(end-start > 1)
		{
			mid = (end+start) >>1;
			if(possibleDistance(mid, array, 3))
				start = mid;
			else
				end = mid;
		}
		System.out.println(start);
	}

}
