package com.epam.Trees;

public class SwapToCorrectNodes {
	
	TreeNode first,prev,last,middle;
	
	void correctBST(TreeNode root)
	{
		first = prev = middle = last = null;
		correctBSTUtil(root);
		
		if (first != null && last != null) 
		{
			int temp = first.val;
			first.val=last.val;
			last.val=temp;
		}
		else if(first != null && middle != null)
		{
			int temp = first.val;
			first.val=middle.val;
			middle.val=temp;
		}
	}
	
	void correctBSTUtil(TreeNode root)
	{
		if (root != null) {
			correctBSTUtil(root.left);
			
			if (prev != null && root.val < prev.val) 
			{
				if (first == null) 
				{
					first = prev;
					middle = root;
				}
				else {
					last = root;
				}
			}
			prev = root;
			correctBSTUtil(root.right);
		}
		
	}

	public static void main(String[] args) {
		

	}

}
