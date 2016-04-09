package edu.dsa.tree.chap6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintReverseBT {
	
	public  void printReverBT(Node root) {
		if(root==null) {
			return ;
		}
		
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		Stack <Node>stack=new Stack<Node>();
		while(!queue.isEmpty()) {
			Node temp=queue.poll();
			
			if(temp.getLeftNode()!=null) {
				queue.add(temp.getLeftNode());
			}
			if(temp.getRightNode()!=null) {
				queue.add(temp.getRightNode());
			}
			stack.add(temp);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().getData());
			
		}
	}

}
