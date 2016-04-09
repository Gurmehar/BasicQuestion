package edu.dsa.queue.chap5;

public class Node {
 Object data;
 Node next;
 
 public Node(Object obj){
	 this.data=obj;
	 this.next=null;
 }
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
}
public Node getNext() {
	return next;
}
public void setNext(Node ptr) {
	this.next = ptr;
}
}
