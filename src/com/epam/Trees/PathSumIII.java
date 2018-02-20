package com.epam.Trees;

public class PathSumIII {
	
	public int pathSum(TreeNode root, int sum) 
	{
		int count=0;
		return pathSumUtil(root, sum, count);
	}
	
	public int pathSumUtil(TreeNode root,int sum,int count)
	{
		if (root==null) {
			return 0;
		}
		if (sum == 0) {
			count++;
		}
		count+=pathSumUtil(root.left, sum-root.val, count);
		count+=pathSumUtil(root.right, sum-root.val, count);
		return count;
		
	}

	public static void main(String[] args) {
		

	}

}
