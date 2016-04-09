package edu.dsa.chap3.ll.single;

/**
 * @author admin1
 *
 */
public class SingleLinkedList {

	
	
	
	public int getSize(Node head){
		int i=0;
		if(head==null ){
			return 0;
		}
		if(head.getNext()==null){
			return 0;
		}
		
		Node currNode=head;
		while(currNode.getNext()!=null){
			i++;
			//System.out.println(currNode.toString());
			currNode=currNode.getNext();
		}
		
		return i;
		
	}
	
	
	public Node addNewNodeAtBeginging(Node head,Node newNode){
		if(head==null){
			return newNode;
		}
		newNode.setNext(head);
		//head.setNext(newNode);
		return newNode;
	}
	
	public Node addNewNodeAtEnd(Node head,Node newNode){
		if(head==null){
			return  newNode;
		}
		Node currNode=head;
		while(currNode.getNext() !=null){
			currNode=currNode.getNext();
		}
		currNode.setNext(newNode);
		newNode.setNext(null);		
		return head;
	}

	public Node addNewNodeAtPos(int pos,Node head,Node newNode){
		if(head==null){
			return newNode;
		}
		
		int size=getSize(head);
		
		if(pos>size+1 || pos<1){
			System.out.println("Invalid Pos "+pos+" size is :"+size);
			return head;
		}
		Node preNode=head;
		for(int i=1;i<pos-1;i++){
			preNode=preNode.getNext();
		}
		Node currNode=preNode.getNext();
		newNode.setNext(currNode);
		preNode.setNext(newNode);
		
		return head;
	}
		
	public Node deleteheadNode(Node head){
		Node temp=head;
		head=head.getNext();
		temp.setNext(null);
		return head;
		
	}
		
	public Node deleteLastNode(Node head){
		
		Node curNode=head;
		Node preNode=null;
		 while(curNode.getNext()!=null){
			 preNode=curNode;
			 curNode=curNode.getNext();
			 
		 }
		
		System.out.println(preNode.toString());
		preNode.setNext(null);		
		
		return head;
		
	}
	
	public Node deleteIntermediateNode(int pos,Node head){
		
		int size=getSize(head);
		
		if(pos>size|| pos<1){
			System.out.println("Invalid Pos");
			return head;
		}
		
		Node prevNode=head;
		int i=1;
		while(i<pos){
			prevNode=prevNode.getNext();
			i++;
		}
		Node curNode=prevNode.getNext();
		prevNode.setNext(curNode.getNext());
		
		return head;
		
	}
	
	
	
	
}
