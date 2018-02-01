package com.epam.Trees;

	public class SubTree {
	
	public boolean isSubtree(TreeNode s, TreeNode t) 
	{
        
        if (s == null) {
			return false;
		}
        if (isSubtreeUtil(s, t)) {
			return true;
		}
        return (isSubtree(s.left, t) || isSubtree(s.right, t));
    }

	public boolean isSubtreeUtil(TreeNode s, TreeNode t) 
	{
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}
		if (s.val!=t.val) {
			return false;
		}
		return (isSubtreeUtil(s.left, t.left)) && isSubtreeUtil(s.right, t.right); 
	}
	
	
}
