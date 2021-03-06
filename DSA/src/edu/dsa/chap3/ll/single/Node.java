package edu.dsa.chap3.ll.single;

public class Node {
	
	private int data;
	private Node next;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "LinkedList [data=" + data + ", next=" + next + "]";
	}
	
}
