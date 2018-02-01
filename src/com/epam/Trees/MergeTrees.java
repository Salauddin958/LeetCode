package com.epam.Trees;

import java.util.HashMap;

public class MergeTrees {
	
	private class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	HashMap<Integer, Integer> map = new HashMap<>();
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) 
    {
		if (t1==null && t2==null) {
			return null;
		}
		if (t1 ==null) {
			return t2;
		}
		if (t2==null) {
			return t1;
		}
		int value = (t1 == null ? 0:t1.val)+(t2 == null ? 0:t2.val);
		TreeNode node = new TreeNode(value);
		node.left = mergeTrees(t1.left, t2.left);
		node.right = mergeTrees(t1.right, t2.right);
		return node;
    }
	
	public static void main(String[] args) 
	{
		

	}

}
