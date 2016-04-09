package edu.dsa.tree.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {
	
	public int findMaxRecursive(Node root) {
		int rootVal,left,right,max=Integer.MIN_VALUE;
		if(root!=null) {
			rootVal=root.getData();
			left=findMaxRecursive(root.getLeftNode());
			right=findMaxRecursive(root.getRightNode());
			System.out.println("left :"+left +" right :"+right +" max :"+max +"  rootVal : "+rootVal );
			if(left>right) {
				max=left;
			}else {
				max=right;
			}
			
			if(rootVal>max) {
				max=rootVal;
			}
		}
		return max;
	}
	
	public int findMax(Node root) {
		int max=Integer.MIN_VALUE;
		if(root==null){
			return max;
		}
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp=queue.poll();
			max=(max<temp.getData())?temp.getData():max;
			
			System.out.println(temp.getData());
			if(temp.getLeftNode()!=null){
				queue.add(temp.getLeftNode());
			}
			if(temp.getRightNode()!=null){
				queue.add(temp.getRightNode());
			}
		}
		queue.clear();
		return max;
	}

}
