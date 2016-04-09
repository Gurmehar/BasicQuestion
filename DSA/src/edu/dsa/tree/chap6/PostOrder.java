package edu.dsa.tree.chap6;

import java.util.Stack;

public class PostOrder {

	public void recursiveInOrder(Node root){
		if(root!=null){
			
			recursiveInOrder(root.getLeftNode());
			
			recursiveInOrder(root.getRightNode());
			System.out.println(root.getData());
		}
	}
	
	
	
	/**
	 * Does not functions as desired:some thing wrong in book
	 * @param root
	 */
	@SuppressWarnings("unused")
	public void nonrecursiveInOrder(Node root){
		Stack<Node> stack = new Stack<Node>();
		
		while(true){
			
			if(root!=null){
				stack.push(root);
				root=root.getLeftNode();
			}else{
				
				if(stack.isEmpty()){
					System.out.println("Stack Empty");
					return;
				}else{
					if(stack.peek().getRightNode()==null){
						root=stack.pop();
						System.out.println(root.getData());
						if(root==stack.peek().getRightNode()){
							System.out.println(stack.peek().getData());
							stack.pop();
						}
					}
					if(!stack.isEmpty()){
						root=stack.peek().getRightNode();
					}else{
						root=null;
					}
				}
				
			}
			
		}
	}
	
	
}
