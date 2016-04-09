package edu.dsa.tree.chap6;

public class Node {
	private Integer data;
	private Node leftNode,rightNode;
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	public Node(int data,Node leftNode,Node rightNode){
		this.data=data;
		this.leftNode=leftNode;
		this.rightNode=rightNode;
	}
	
}