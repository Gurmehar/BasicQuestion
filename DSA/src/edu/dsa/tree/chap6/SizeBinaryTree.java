package edu.dsa.tree.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class SizeBinaryTree {
	
	public int sizeOfTreeRecursive(Node root) {
		if(root==null) {
			return 0;
		}
		return (sizeOfTreeRecursive(root.getLeftNode())+1+sizeOfTreeRecursive(root.getRightNode()));
	}
	
	public int sizeOfTree(Node root) {
		int size=0;
		if(root==null) {
			return 0;
			
		}
		
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
			Node temp=queue.poll();
			size++;
			if(temp.getLeftNode()!=null) {
				queue.add(temp.getLeftNode());
			}
			if(temp.getRightNode()!=null) {
				queue.add(temp.getRightNode());
			}
			
		}
		return size;
		
	}
	

}
