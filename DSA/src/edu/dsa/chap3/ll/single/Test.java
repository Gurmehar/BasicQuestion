package edu.dsa.chap3.ll.single;

public class Test {
	
	public static void main(String[] args) {
	Node one = new Node();
		 one.setData(1);
					
	Node two = new Node();
		 two.setData(2);
		 two.setNext(null);	
		 one.setNext(two);
	Node three = new Node();
		three.setData(3);
		three.setNext(null);
		two.setNext(three);
	Node four = new Node();
		 four.setData(4);
		 four.setNext(null);					
	//
	
	SingleLinkedList sll= new SingleLinkedList();
	//one=sll.addNewNodeAtBeginging(one, four);
	//one=sll.addNewNodeAtEnd(one, four);
	one=sll.addNewNodeAtPos(3,one, four);
	//one=sll.deleteheadNode(one);
	//one=sll.deleteLastNode(one);
	System.out.println(one.toString());
	one=sll.deleteIntermediateNode(2, one);
	System.out.println(one.toString());
	
	}
	
}
