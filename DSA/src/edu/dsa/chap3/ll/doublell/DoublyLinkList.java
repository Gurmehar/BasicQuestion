package edu.dsa.chap3.ll.doublell;

public class DoublyLinkList {
	
	public Node addNodeAtBeginging(Node head,Node newNode){
		if(head==null){
			return newNode;
		}
		
		head.setPrevNode(newNode);
		newNode.setNextNode(head);
		newNode.setPrevNode(null);
		
		return newNode;
	}
	
	
	public Node addNodeAtEnd(Node head,Node newNode){
		if(head==null){
			return newNode;
		}
		
		Node curNode=head;
		while(curNode.getNextNode()!=null){
			curNode=curNode.getNextNode();
		}
		curNode.setNextNode(newNode);
		newNode.setPrevNode(curNode);
		newNode.setNextNode(null);
		
		return head;
		
	}
	
	
	public int getCount(Node head){
		int count=1;
		Node curNode=head;
		while(curNode.getNextNode()!=null){
			System.out.println(curNode.toString());
			curNode=curNode.getNextNode();
			count++;
			
		}
		return count;
	}
	
	public Node addNodeAtIntermediate(int pos,Node head,Node newNode){
		if(head ==null){
			return newNode;
		}
		int size=getCount(head);
		int count=1;
		
		if(pos>size+1 || pos<1){
			System.out.println("Invalid Pos");
			return head;
		}
		
		Node curNode=head;
		 while(count<pos){
			curNode=curNode.getNextNode();
			count++;
		 }
		Node tempNode=curNode.getNextNode();
		tempNode.setPrevNode(newNode);
		newNode.setNextNode(tempNode);
		newNode.setPrevNode(curNode);
		curNode.setNextNode(newNode);
		
		return head;
	}
	
	public Node deleteFirstNode(Node head){
		
		Node curNode=head;
		head=head.getNextNode();
		head.setPrevNode(null);
		
		curNode.setNextNode(null);
		return head;		
	}
	
   public Node deleteLastNode(Node head){
	   Node curNode=head;
	   while(curNode.getNextNode()!=null){
		   
		   curNode=curNode.getNextNode();
	   }
	   Node temp =curNode.getPrevNode();
	   temp.setNextNode(null);
	   return head;
   }
   
   public Node deleteIntermediateNode(int pos,Node head){
	   
	   if(head==null){
		   return null;
	   }
	   
	   int size=getCount(head);
	   System.out.println(size);
	   if(pos<1|| pos>size){
		   System.out.println("Invalid Pos");
		   return head;
	   }
	   
	   if(pos==1){
		   head=deleteFirstNode(head);
		   return head;
	   }
	   
	   int count=1;
	   Node curNode=head;
	   while(count<pos-1){
		   curNode=curNode.getNextNode();
		   count++;
	   }
	   System.out.println("curNode -- > "+curNode.toString());
	   
	  Node  node2Del=curNode.getNextNode();
	  Node laterNode=node2Del.getNextNode();
	  curNode.setNextNode(laterNode);
	  if(laterNode!=null){
		  laterNode.setPrevNode(curNode);
	  }
	   return head;
   }
	
	

}
