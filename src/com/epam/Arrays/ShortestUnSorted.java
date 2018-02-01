package com.epam.Arrays;

public class ShortestUnSorted {
	
	
	
	
	
	public int findUnsortedSubarray(int[] nums) 
	{
		if (nums == null) {
			return 0;
		}
		int n = nums.length;
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++)
		{
			if (nums[i]<nums[i-1]) {
				minimum = Math.min(minimum, nums[i]);
			}
		}
		for(int j=n-2;j>=0;j--)
		{
			if (nums[j+1]< nums[j]) {
				maximum = Math.max(maximum, nums[j]);
			}
		}
		int i,j;
		for(i=0;i<n;i++)
		{
			if (minimum < nums[i]) {
				break;
			}
		}
		for(j=n-1;j>=0;j--)
		{
			if (maximum > nums[j]) {
				break;
			}
		}
		return (j-i) < 0 ? 0 :(j-i+1);
    }

	public static void main(String[] args) 
	{
		int[] a = {1,3,2,2,2};
		ShortestUnSorted st = new ShortestUnSorted();
		System.out.println(st.findUnsortedSubarray(a));

	}

}
