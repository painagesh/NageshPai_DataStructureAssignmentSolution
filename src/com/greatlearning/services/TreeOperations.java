package com.greatlearning.services;

public class TreeOperations {
	
	public static Node prevNode = null;
	public static Node headNode = null;
	
	// Function to to flatten the binary
		// search tree into a skewed tree in
		// increasing order
		public void flattenBTToSkewed(Node root)
		{

			// Base Case
			if(root == null)
			{
				return;
			}

			flattenBTToSkewed(root.left);

			Node rightNode = root.right;
			//Node leftNode = root.left;

			// Condition to check if the root Node
			// of the skewed tree is not defined
			if(headNode == null)
			{
				headNode = root;
				root.left = null;
				prevNode = root;
			}
			else
			{
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			flattenBTToSkewed(rightNode);

		}
	
		
		public static void traverseRightSkewed(Node root)
		{
			if(root == null)
			{
				return;
			}
			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);	
		}
		
		public void displayTree ()
		{
			traverseRightSkewed (headNode);
		}
}
