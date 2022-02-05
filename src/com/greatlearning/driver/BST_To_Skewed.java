package com.greatlearning.driver;

import com.greatlearning.services.*;


class BST_To_Skewed
{
	public Node node;

	public static void main (String[] args)
	{
		BST_To_Skewed tree = new BST_To_Skewed();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node (10);
		tree.node.right.left = new Node(55);

		//Function to create skewed tree
		TreeOperations TreeOps = new TreeOperations ();
		TreeOps.flattenBTToSkewed(tree.node);


		//function to traverse the skewed tree
		TreeOps.displayTree();

	}
}

