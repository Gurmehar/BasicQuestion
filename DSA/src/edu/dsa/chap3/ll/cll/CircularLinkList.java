package edu.dsa.chap3.ll.cll;

public class CircularLinkList {
	
	
	public int getCount(Node head){
		
		Node curNode=head;
		int count=0;
		while(curNode.getNext()!=null){
			count++;
			System.out.println(curNode.toString());
			curNode=curNode.getNext();
			if(curNode==head){
				break;
			}
		}
		
		return count;
	}
	
	public Node addNodeAtEnd(Node head,Node node2Insert){
		
		node2Insert.setNext(node2Insert);
		if(head==null){
			return node2Insert;
		}
		
		Node curNode=head;
		while(curNode.getNext()!=head){
			curNode=curNode.getNext();
		}
		node2Insert.setNext(head);
		curNode.setNext(node2Insert);
		
		return head;
	}
	
	public Node addNodeAtStart(Node head,Node node2Insert){
		node2Insert.setNext(node2Insert);
		if(head==null){
			return node2Insert;
		}
		Node curNode=head;
		while(curNode.getNext()!=head){
			curNode=curNode.getNext();
		}
		
		node2Insert.setNext(head);
		curNode.setNext(node2Insert);
		
		
		return node2Insert;
	}
	
	public Node deleteLastNode(Node head){
		
		if(head==null){
			System.out.println("List Empty Can Delete ");
			return head;
		}
		
		Node temp=head;
		Node curNode=head;
		while(curNode.getNext()!=head){
			
			temp=curNode;
			curNode=curNode.getNext();
		}
		 temp.setNext(head);
		 curNode=null;
		 return head;
		
	}
	
	public Node deleteFirstNode(Node head){
		
		if(head==null){
			System.out.println("List Empty Can Delete");
			return head;
		}
		//Node temp=head;
		Node curNode=head;
		while(curNode.getNext()!=head){
			//temp=curNode;
			curNode=curNode.getNext();
		}
		
		curNode.setNext(head.getNext());
		 return curNode;
		
	}

}
