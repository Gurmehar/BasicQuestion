package edu.dsa.chap3.ll.question;

public class ModularNode {
	
	public Node  getModularFromStart(Node head, int k){
		
		Node temp=head,mNode=null;
		
		if(head==null){
			return null;
		}
		if(k<0){
			return null;
		}
		int i=1;
		for(;temp!=null;temp=temp.getNext()){
			if(i%k==0){
				mNode=temp;
			}
			i++;
		}
		
		return mNode;
	}
	
	
	public Node getFractionalNode(Node head, int k){
		if(head==null){
			return null;
		}
		if(k<0){
			return null;
		}
		int i=0;
		Node temp=null;
		for(;head!=null;head=head.getNext()){
			if(i%k==0){
				if(temp==null){
					temp=head;
				}else{
					temp=temp.getNext();
				}
			}
			i++;
		}
		return temp;
		
	}

}



