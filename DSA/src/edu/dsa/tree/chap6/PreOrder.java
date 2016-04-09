package edu.dsa.tree.chap6;

import java.util.Stack;

public class PreOrder {

	public void recursiveInOrder(Node root){
		if(root!=null){
			System.out.println(root.getData());
			recursiveInOrder(root.getLeftNode());
			recursiveInOrder(root.getRightNode());
		}
	}
	
	@SuppressWarnings("unused")
	public void nonrecursiveInOrder(Node root){
		Stack<Node> stack = new Stack();
		while(true){
			while(root!=null){
				System.out.println(root.getData());
				stack.push(root);
				root=root.getLeftNode();
			}
			if(stack.isEmpty()){
				break;
			}
				root=stack.pop();
				root=root.getRightNode();
			}
		}
	
	
}
