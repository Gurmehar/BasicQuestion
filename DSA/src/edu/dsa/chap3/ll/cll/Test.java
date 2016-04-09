package edu.dsa.chap3.ll.cll;

public class Test {

	public static void main(String[] args) {
		CircularLinkList cll = new CircularLinkList();
		Node head = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
			 head.setData(1);
			 head.setNext(two);
			 two.setData(2);
			 two.setNext(head);
		 	 three.setData(3);
		 	 four.setData(4);
		 	 
			 
		head=cll.addNodeAtEnd(head, three);
		
		head=cll.addNodeAtStart(head, four);
		System.out.println(cll.getCount(head));
		//head =cll.deleteLastNode(head);
		head =cll.deleteFirstNode(head);
		System.out.println(cll.getCount(head));	 
	}
}
