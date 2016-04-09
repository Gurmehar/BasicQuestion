package edu.dsa.tree.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public void traverse(Node root){
		if(root==null){
			return;
		}
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp=queue.poll();
			System.out.println(temp.getData());
			if(temp.getLeftNode()!=null){
				queue.add(temp.getLeftNode());
			}
			if(temp.getRightNode()!=null){
				queue.add(temp.getRightNode());
			}
		}
		queue.clear();
		
	}
	
	

}
