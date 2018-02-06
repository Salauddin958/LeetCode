package com.epam.Arrays;

public class TargetSum {
	
	private int count=0;
	
	public int findTargetSumWays(int[] nums, int S) 
	{
		
		calculate(nums, 0, 0, S);
		return count;
    }
	public void calculate(int[] nums,int index,int sum,int S)
	{
		if (index == nums.length-1) {
			if (sum == S) {
				count++;
			}
		}
		else {
			calculate(nums, index+1, sum+nums[index], S);
			calculate(nums, index+1, sum-nums[index], S);
		}
	}
	
	

	public static void main(String[] args) {
		
		
	}

}
