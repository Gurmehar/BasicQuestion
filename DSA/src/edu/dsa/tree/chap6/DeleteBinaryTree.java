package edu.dsa.tree.chap6;

public class DeleteBinaryTree {
	
	public void deleteTree(Node root) {
		
		if(root==null) {
			return;
		}
		
		deleteTree(root.getLeftNode());
		deleteTree(root.getRightNode());
		 
		root=null;
	}

}
