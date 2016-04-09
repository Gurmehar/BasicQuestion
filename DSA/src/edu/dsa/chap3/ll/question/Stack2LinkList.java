package edu.dsa.chap3.ll.question;

import edu.dsa.chap3.ll.single.Node;

public class Stack2LinkList {

	public Node push(Node head,Node newNode){
		
			if(head==null){
				return newNode;
			}
			newNode.setNext(head);
			
			
		
		return newNode;
	}
	
	public Node pop(Node head){
		Node temp=head;
		head=head.getNext();
		temp.setNext(null);
		return head;
		
	}
}
