package edu.dsa.chap3.ll.doublell;

public class Test {
	
	
	public static void main(String[] args) {
		Node head = new Node();
			 head.setData(0);
			 head.setNextNode(null);
			 head.setPrevNode(null);
			 
		Node child = new Node();
			 child.setData(1);
			 child.setNextNode(null);
			 head.setNextNode(child);
			 child.setPrevNode(head);	
			
		Node child2 = new Node();
		child2.setData(2);
		child2.setNextNode(null);
		child.setNextNode(child2);
		child2.setPrevNode(child);
		
		
		Node child3 = new Node();
		child3.setData(3);
		//child3.setNextNode(null);
		//child3.setPrevNode(null);
		
		DoublyLinkList dll = new DoublyLinkList();
					 // head= dll.addNodeAtBeginging(head, child3);
					  head=dll.addNodeAtEnd(head, child3);
					 //head=dll.addNodeAtIntermediate(2, head, child3);
					 	//System.out.println(head.toString());
					//	head=dll.deleteFirstNode(head);
					//  System.out.println(dll.getCount(head));
					 	//head=dll.deleteLastNode(head);
					  head=dll.deleteIntermediateNode(3, head);
					  System.out.println(dll.getCount(head));
			 
	}

}
