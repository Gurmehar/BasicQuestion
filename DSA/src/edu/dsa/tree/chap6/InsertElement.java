package edu.dsa.tree.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class InsertElement {
	
	public void addElement(Node root,Node ele) {
		if(root==null) {
			root=ele;
			return;
		}
		
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.poll();
			if(temp.getLeftNode()==null) {
				temp.setLeftNode(ele);	
				return;
			}else {
				queue.add(temp.getLeftNode());
			}
			
			if(temp.getRightNode()==null) {
				temp.setRightNode(ele);
				return;
			}else {
				queue.add(temp.getRightNode());
			}
			
			
			
		}
		
		
		
		
	}

}
