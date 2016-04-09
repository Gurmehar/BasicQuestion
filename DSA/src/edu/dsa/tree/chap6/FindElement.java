package edu.dsa.tree.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class FindElement {
	
	public boolean findElement(Node root, int ele) {
		
		if(root!=null) {
			if(ele==root.getData()) {
				return true;
			}else {
				 if(!findElement(root.getLeftNode(), ele)) {
					 return findElement(root.getRightNode(), ele);
				 }else {
					 return true;
				 }
				
			}
		}
		
		
		return false;
	}

	public boolean findWithoutRecursion(Node root,int ele) {
		
		if(root!=null) {
			Queue<Node> queue= new LinkedList<Node>();
			queue.add(root);
			while(!queue.isEmpty()) {
				Node temp=queue.poll();
				if(ele==temp.getData()) {
					return true;
				}
				if(temp.getLeftNode()!=null) {
					queue.add(temp.getLeftNode());
				}
				if(temp.getRightNode()!=null) {
					queue.add(temp.getRightNode());
				}
				
			}
		}
		
		return false;
	}
	
}
