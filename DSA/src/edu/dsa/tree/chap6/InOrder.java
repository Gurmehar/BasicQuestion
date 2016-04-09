package edu.dsa.tree.chap6;

import java.util.Stack;

public class InOrder{

	public void recursiveInOrder(Node root){
		if(root!=null){
			
			recursiveInOrder(root.getLeftNode());
			System.out.println(root.getData());
			recursiveInOrder(root.getRightNode());
		}
	}
	
	@SuppressWarnings("unused")
	public void nonrecursiveInOrder(Node root){
		Stack<Node> stack = new Stack();
		while(true){
			while(root!=null){
				
				stack.push(root);
				root=root.getLeftNode();
				
			}
			if(stack.isEmpty()){
				break;
			}
				root=stack.pop();
				System.out.println(root.getData());
				root=root.getRightNode();
			}
		}
	
}
