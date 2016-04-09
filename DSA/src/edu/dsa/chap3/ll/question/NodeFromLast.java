package edu.dsa.chap3.ll.question;

public class NodeFromLast {
	
	public Node getNthNode(Node head ,int n){
		
		Node nthNode=null;
		Node curNode=head;
		int cntr =0;
		 while(curNode.getNext()!=null){
			  cntr++;
			  curNode=curNode.getNext();
			  if(cntr==n){
				  nthNode=head;
			  }else if(cntr>n){
				  nthNode=nthNode.getNext();
			  }
		 }
		
		
		
		return nthNode;
	}

}
